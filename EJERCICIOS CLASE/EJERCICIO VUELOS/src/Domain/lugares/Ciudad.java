package Domain.lugares;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import Domain.viajes.Vuelo;

public class Ciudad {
    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.aeropuertos = new ArrayList<Aeropuerto>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public Integer cantDeAeropuertos(){
        return this.aeropuertos.size(); // pongo this para indicar que es un atributo
    }

    public void agregarAeropuerto(Aeropuerto ... aeropuerto){
        Collections.addAll(this.aeropuertos, aeropuerto);
    }

    public Integer cantidadPasajerosEnUnDia(LocalDate unDia){
        List<Vuelo> vuelosQueLLegaronEseDia = this.aeropuertos
                .stream().flatMap(aeropuerto -> aeropuerto.vuelosQueLLegaronUnDia(unDia).stream())
                .collect(Collectors.toList());

        return vuelosQueLLegaronEseDia.stream().mapToInt(Vuelo::cantPasajeros).sum(); // pasaje por referencia de metodo y si el metodo no recibe parametros

    }


}