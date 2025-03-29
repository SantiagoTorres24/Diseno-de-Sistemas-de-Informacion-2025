package Domain.viajes;

import Domain.lugares.Aeropuerto;
import Domain.lugares.Ciudad;
import Domain.personas.Pasajero;
import Domain.personas.Tripulacion;

import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {
    private Aeropuerto origen;
    private Aeropuerto destino;
    private LocalDateTime fechaHora;
    private Double duracionEstimadaMins;
    private Avion avion;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

public Integer cantPasajeros(){
    return this.pasajeros.size();
}

public Double capacidadOcupadasPorPasajeros(){
    return (this.cantPasajeros() * 100.00)/this.avion.getCantAsientos();
}

public boolean tuDestinoEs(Ciudad ciudad) {
    //TODO
    return true;
    }
}
