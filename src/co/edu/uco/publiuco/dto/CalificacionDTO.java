package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class CalificacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private LectorDTO lector;
    private LocalDateTime fechaCalificacion;
    private String calificacion;

    public CalificacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setLector(LectorDTO.create());
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

    public CalificacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public CalificacionDTO setPublicacion(final PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

    public CalificacionDTO setLector(final LectorDTO lector) {
        this.lector = UtilObject.getDefault(lector, LectorDTO.create());
        return this;
    }

    public CalificacionDTO setFechaCalificacion(final LocalDateTime fechaCalificacion) {
        this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
        return this;
    }

    public CalificacionDTO setCalificacion(final String calificacion) {
        this.calificacion = UtilText.applyTrim(calificacion);
        return this;
    }
    public static CalificacionDTO create (){
        return new CalificacionDTO();
    }
}
