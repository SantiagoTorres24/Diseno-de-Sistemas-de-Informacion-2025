package Domain.personas;

import Domain.lugares.Ciudad;
import Domain.lugares.Pais;
import Domain.viajes.Vuelo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

public class Pasajero extends Persona {
    private List<Vuelo> vuelos;
    private Integer nroPasaporte;
    private Pais pais;


    public Pasajero(String nombre, String apellido, Integer nroDocumento, TipoDocumento tipoDocumento) {
        super(nombre, apellido, nroDocumento, tipoDocumento);

    }


    public Integer cantVuelos() {
        return this.vuelos.size();
    }

    public Integer cantVecesVisiteCiudad(Ciudad ciudad) {
        return (int) this.vuelos.stream().filter(vuelo -> vuelo.tuDestinoEs(ciudad)).count();
    }


}
