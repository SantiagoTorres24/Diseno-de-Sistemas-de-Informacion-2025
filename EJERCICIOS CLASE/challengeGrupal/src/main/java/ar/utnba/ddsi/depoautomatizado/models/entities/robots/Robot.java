package ar.utnba.ddsi.depoautomatizado.models.entities.robots;


import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Posicion;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Obstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.Recorrido;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EstrategiaObstaculo;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comando.Comando;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Robot {
  private Long id;
  private boolean disponible;
  private EstrategiaObstaculo estrategiaObstaculo; //Estas estrategias son de failover y se configura de antemano para el armado de paquete (recolección de todas las mercaderías).
  private List<Posicion> posiciones; //TRAZABILIDAD DE POSICIONES PASADAS
  private List<Comando> comandos; //TRAZABILIDAD DE COMANDOS REALIZADOS

  Robot(Long id) {
    this.id = id;
    this.disponible = true;
  }

  // Para cambiar la estrategia de obstaculo en cada pedido
  // se debería implementar en PedidosService
  Robot(EstrategiaObstaculo estrategiaObstaculo) {
    this.estrategiaObstaculo = estrategiaObstaculo;
  }

  public Posicion posicionActual(){
    return posiciones.get(posiciones.size()-1);
  }

  public Posicion primeraPosicion(){
    return posiciones.get(0);
  }

  public void agregarPosicion(Posicion posicion){
    posiciones.add(posicion);
  }

  public void agregarComando(Comando comando){
    comandos.add(comando);
  }

  //5. Un robot para buscar la mercadería recibe una secuencia de órdenes preestablecidas,
  //porque en sí mismo no es capaz de resolver el recorrido.
  public void buscarMercaderia(Recorrido recorrido) throws InterruptedException {
    recorrido.ejecutarRecorrido(this);
  }

  public Posicion hacerMovimiento(Comando comando){
    comandos.add(comando);
    return comando.ejecutar(this);
  }

  public void tratarObstaculo(Obstaculo obstaculo) {
    estrategiaObstaculo.manejarObstaculo(this, obstaculo);
  }

  public void formaDeEsquivarObstaculo(Obstaculo obstaculo) {}

} 