package co.edu.uco.publiuco.dto;


import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;


public final class EstadoDTO {

    private UUID identificador;
    private String nombre;
    private TipoEstadoDTO tipoEstado;


    public EstadoDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setTipoEstado(TipoEstadoDTO.create());
    }


    public EstadoDTO(UUID identificador, String nombre, TipoEstadoDTO tipoEstado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setTipoEstado(tipoEstado);
    }

    public final EstadoDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public final EstadoDTO setTipoEstado(final TipoEstadoDTO tipoEstado) {

        this.tipoEstado = UtilObject.getDefault(tipoEstado, TipoEstadoDTO.create());
        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoDTO getTipoEstado() {
        return tipoEstado;
    }

    public static EstadoDTO create (){
        return new EstadoDTO();
    }
}
