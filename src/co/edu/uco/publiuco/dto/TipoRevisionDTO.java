package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class TipoRevisionDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    public TipoRevisionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoRevisionDTO(UUID identificador, String nombre, String descripcion) {
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


    public TipoRevisionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public TipoRevisionDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoRevisionDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }



}


