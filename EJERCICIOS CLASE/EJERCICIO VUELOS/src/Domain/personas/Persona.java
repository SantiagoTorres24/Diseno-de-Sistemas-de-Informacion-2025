package Domain.personas;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer nroDocumento;
    protected TipoDocumento tipoDocumento;

    public Persona(String nombre, String apellido, Integer nroDocumento, TipoDocumento tipoDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }
}
