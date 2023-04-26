package co.edu.uco.publiuco.dto;


import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;


public final class EstadoDTO {

    private UUID identificador;
    private String nombre;
    private TipoEstadoDTO tipoEstado;
    private String descripcion;


    public EstadoDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getUtilText().getDefaultValue());
        setTipoEstado(new TipoEstadoDTO());
        setDescripcion(UtilText.EMPTY);
    }


    public EstadoDTO(final UUID identificador, final String nombre, final TipoEstadoDTO tipoEstado, final String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setTipoEstado(tipoEstado);
        setDescripcion(descripcion);
    }
    
    public static EstadoDTO create() {
    	return new EstadoDTO();
    }

    public final EstadoDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoDTO setNombre(final String nombre) {
        this.nombre = UtilText.getUtilText().applyTrim(nombre);
        return this;
    }

    public final EstadoDTO setTipoEstado(final TipoEstadoDTO tipoEstado) {

        this.tipoEstado = tipoEstado;
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

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
    
	@Override
	public String toString() {
		return "EstadoDTO [identificador=" + identificador + ", nombre=" + nombre + ", tipoEstado=" + tipoEstado
				+ ", descripcion=" + descripcion + "]";
	}
    
}
