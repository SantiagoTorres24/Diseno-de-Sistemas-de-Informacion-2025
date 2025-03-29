package Domain.lugares;

import Domain.viajes.Vuelo;

import java.time.LocalDate;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;

    public List<Vuelo> vuelosQueLLegaronUnDia(LocalDate unDia) {
        //TODO
        return null;
    }

    public Integer cantVuelosQueSalieronUnDia(LocalDate unDia){
        //TODO
        return 0;
    }

    public Integer cantVuelosQueLlegaronUnDia(LocalDate unDia){
        //TODO
        return 0;
    }

}
