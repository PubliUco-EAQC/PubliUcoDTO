package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class TipoIdentificacionDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    public TipoIdentificacionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoIdentificacionDTO(UUID identificador, String nombre, String descripcion, EstadoDTO estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public TipoIdentificacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoIdentificacionDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoIdentificacionDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public static TipoIdentificacionDTO create (){
        return new TipoIdentificacionDTO();
    }
}


