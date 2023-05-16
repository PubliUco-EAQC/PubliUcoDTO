package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class TipoRelacionInstitucionDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;

    public TipoRelacionInstitucionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
    }
    public TipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion, EstadoDTO estado) {
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

    public TipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoRelacionInstitucionDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public TipoRelacionInstitucionDTO setEstado(final EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
    public static TipoRelacionInstitucionDTO create (){
        return new TipoRelacionInstitucionDTO();
    }

}


