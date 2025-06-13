package entities.observers.adapters;

import entities.productos.Producto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Setter
@Getter

@Component
public class AdapterSistemaContableHTTP implements IAdapterSistemaContable {
  private final WebClient webClient;

  public AdapterSistemaContableHTTP(){
    this.webClient = WebClient.create("https://sistema-contable/api");
  }

  @Override
  public void notificar(Producto producto) {
    webClient.post()//indica un post
             .uri("/ventas")//a la url de arriba + /ventas
             .bodyValue(producto)//serializa el producto a JSON
             .retrieve()//ejecuta
             .bodyToMono(Void.class)
             .subscribe();//asincronismo, si no pongo esto no se lanza
  }
}

/*
WebClient lo ofrece springboot que se usa para hacer llamadas HTTP de manera reactiva y no
bloqueante. Consume APIs externas haciendo post o get
*/