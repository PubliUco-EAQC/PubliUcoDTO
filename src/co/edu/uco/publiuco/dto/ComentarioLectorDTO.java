package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
public final class ComentarioLectorDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private String cotenido;
	private LocalDateTime fechaCalificacion;
	private EstadoDTO estado;

	public ComentarioLectorDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(new LectorDTO());
		setPublicacion(new PublicacionDTO());
		setComentarioPadre(new ComentarioLectorDTO());
		setCotenido(UtilText.getDefaultValue());
		setFechaCalificacion(UtilDate.getDefault());
		setEstado(new EstadoDTO());
	}

	public ComentarioLectorDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion, ComentarioLectorDTO comentarioPadre, String contenido, LocalDateTime fechaCalificacion, EstadoDTO estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setCotenido(contenido);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public LectorDTO getLector() {
		return lector;
	}

	public PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public ComentarioLectorDTO getComentarioPadre() {
		return comentarioPadre;
	}

	public String getCotenido() {
		return cotenido;
	}

	public LocalDateTime getFechaCalificacion() {
		return fechaCalificacion;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public ComentarioLectorDTO setIdentificador(UUID identificador) {
		this.identificador = identificador;
		return this;
	}

	public ComentarioLectorDTO setLector(LectorDTO lector) {
		this.lector = lector;
		return this;
	}

	public ComentarioLectorDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = publicacion;
		return this;
	}

	public ComentarioLectorDTO setComentarioPadre(ComentarioLectorDTO comentarioPadre) {
		this.comentarioPadre = comentarioPadre;
		return this;
	}

	public ComentarioLectorDTO setEstado(EstadoDTO estado) {
		this.estado = estado;
		return this;
	}

	public ComentarioLectorDTO setCotenido(String cotenido) {
		this.cotenido = cotenido;
		return this;
	}

	public ComentarioLectorDTO setFechaCalificacion(LocalDateTime fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
		return this;
	}
}