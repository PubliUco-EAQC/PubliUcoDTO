package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class RevisorRevisionDTO {
    private UUID identificador;
    private RevisionDTO revision;
    private RevisorDTO revisor;
    private LocalDateTime fechaAsignacionRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoDTO estado;

    public RevisorRevisionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setRevision(new RevisionDTO());
        setRevisor(new RevisorDTO());
    }
    public RevisorRevisionDTO(UUID identificador, RevisionDTO revision, RevisorDTO revisor, LocalDateTime fechaAsignacionRevision, LocalDateTime fechaCompletitudRevision, EstadoDTO estado) {
        setIdentificador(identificador);
        setRevision(revision);
        setRevisor(revisor);
        setFechaAsignacionRevision(fechaAsignacionRevision);
        setFechaCompletitudRevision(fechaCompletitudRevision);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public RevisionDTO getRevision() {
        return revision;
    }

    public RevisorDTO getRevisor() {
        return revisor;
    }

    public LocalDateTime getFechaAsignacionRevision() {
        return fechaAsignacionRevision;
    }

    public LocalDateTime getFechaCompletitudRevision() {
        return fechaCompletitudRevision;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public RevisorRevisionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public RevisorRevisionDTO setRevision(RevisionDTO revision) {
        this.revision = revision;
        return this;
    }

    public RevisorRevisionDTO setRevisor(RevisorDTO revisor) {
        this.revisor = revisor;
        return this;
    }

    public RevisorRevisionDTO setFechaAsignacionRevision(LocalDateTime fechaAsignacionRevision) {
        this.fechaAsignacionRevision = fechaAsignacionRevision;
        return this;
    }

    public RevisorRevisionDTO setFechaCompletitudRevision(LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = fechaCompletitudRevision;
        return this;
    }

    public RevisorRevisionDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
