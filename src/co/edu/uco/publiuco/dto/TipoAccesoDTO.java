package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class TipoAccesoDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;

    public TipoAccesoDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
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

    public TipoAccesoDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoAccesoDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoAccesoDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public TipoAccesoDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static TipoAccesoDTO create (){
        return new TipoAccesoDTO();
    }

}
