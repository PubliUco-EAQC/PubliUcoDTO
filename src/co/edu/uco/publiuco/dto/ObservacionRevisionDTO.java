package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ObservacionRevisionDTO {
    private UUID identificador;
    private EscritorPublicacionDTO escritorPublicacion;
    private ComentarioRevisorDTO comentarioRevisor;
    private LocalDateTime fechaReportePublicacion;
    private LocalDateTime fechaRevisionObservacion;
    private String observacion;
    private EstadoDTO estado;

    public ObservacionRevisionDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setEscritorPublicacion(new EscritorPublicacionDTO());
        setComentarioRevisor(new ComentarioRevisorDTO());
        setFechaReportePublicacion(UtilDate.getDefault());
        setFechaRevisionObservacion(UtilDate.getDefault());
        setObservacion(UtilText.getDefaultValue());
        setEstado(new EstadoDTO());
    }

    public ObservacionRevisionDTO(UUID identificador, EscritorPublicacionDTO escritorPublicacion, ComentarioRevisorDTO comentarioRevisor, LocalDateTime fechaReportePublicacion, LocalDateTime fechaRevisionObservacion, String observacion, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setEscritorPublicacion(escritorPublicacion);
        setComentarioRevisor(comentarioRevisor);
        setFechaReportePublicacion(fechaReportePublicacion);
        setFechaRevisionObservacion(fechaRevisionObservacion);
        setObservacion(observacion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public EscritorPublicacionDTO getEscritorPublicacion() {
        return escritorPublicacion;
    }

    public ComentarioRevisorDTO getComentarioRevisor() {
        return comentarioRevisor;
    }

    public LocalDateTime getFechaReportePublicacion() {
        return fechaReportePublicacion;
    }

    public LocalDateTime getFechaRevisionObservacion() {
        return fechaRevisionObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public ObservacionRevisionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public ObservacionRevisionDTO setEscritorPublicacion(EscritorPublicacionDTO escritorPublicacion) {
        this.escritorPublicacion = escritorPublicacion;
        return this;
    }

    public ObservacionRevisionDTO setComentarioRevisor(ComentarioRevisorDTO comentarioRevisor) {
        this.comentarioRevisor = comentarioRevisor;
        return this;
    }

    public ObservacionRevisionDTO setFechaReportePublicacion(LocalDateTime fechaReportePublicacion) {
        this.fechaReportePublicacion = fechaReportePublicacion;
        return this;
    }

    public ObservacionRevisionDTO setFechaRevisionObservacion(LocalDateTime fechaRevisionObservacion) {
        this.fechaRevisionObservacion = fechaRevisionObservacion;
        return this;
    }

    public ObservacionRevisionDTO setObservacion(String observacion) {
        this.observacion = UtilText.applyTrim(observacion);
        return this;
    }

    public ObservacionRevisionDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
