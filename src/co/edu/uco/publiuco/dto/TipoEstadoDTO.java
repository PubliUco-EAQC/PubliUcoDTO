package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class TipoEstadoDTO {
    private UUID identificador;
    private String nombre;


    public TipoEstadoDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getDefaultValue());
    }
    public TipoEstadoDTO(UUID identificador, String nombre) {
        setIdentificador(identificador);
        setNombre(nombre);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }



    public TipoEstadoDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public TipoEstadoDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }




}

