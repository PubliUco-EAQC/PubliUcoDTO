package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class TipoAccesoDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;

    public TipoAccesoDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(new EstadoDTO());
    }
    public TipoAccesoDTO(UUID identificador, String nombre, String descripcion, EstadoDTO estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
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

    public EstadoDTO getEstado() {
        return estado;
    }

    public TipoAccesoDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public TipoAccesoDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoAccesoDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public TipoAccesoDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }

}
