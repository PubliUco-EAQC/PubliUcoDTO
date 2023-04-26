package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class TipoComentarioRevisorDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    public TipoComentarioRevisorDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoComentarioRevisorDTO(UUID identificador, String nombre, String descripcion) {
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


    public TipoComentarioRevisorDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public TipoComentarioRevisorDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoComentarioRevisorDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }



}
