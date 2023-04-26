package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class CalificacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private LectorDTO lector;
    private LocalDateTime fechaCalificacion;
    private String calificacion;

    public CalificacionDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPublicacion(new PublicacionDTO());
        setLector(new LectorDTO());
        setFechaCalificacion(UtilDate.getDefaultValue());
        setCalificacion(UtilText.getDefaultValue());
    }

    public CalificacionDTO(UUID identificador, PublicacionDTO publicacion, LectorDTO lector, LocalDateTime fechaCalificacion, String calificacion) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setLector(lector);
        setFechaCalificacion(fechaCalificacion);
        setCalificacion(calificacion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public LectorDTO getLector() {
        return lector;
    }

    public LocalDateTime getFechaCalificacion() {
        return fechaCalificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public CalificacionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public CalificacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public CalificacionDTO setLector(LectorDTO lector) {
        this.lector = lector;
        return this;
    }

    public CalificacionDTO setFechaCalificacion(LocalDateTime fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
        return this;
    }

    public CalificacionDTO setCalificacion(String calificacion) {
        this.calificacion = UtilText.applyTrim(calificacion);
        return this;
    }
}
