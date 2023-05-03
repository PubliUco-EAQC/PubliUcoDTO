package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class RevisorRevisionDTO {
    private UUID identificador;
    private RevisionDTO revision;
    private RevisorDTO revisor;
    private LocalDateTime fechaAsignacionRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoDTO estado;

    public RevisorRevisionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setRevision(RevisionDTO.create());
        setRevisor(RevisorDTO.create());
        setFechaAsignacionRevision(UtilDate.getDefaultValue());
        setFechaCompletitudRevision(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());

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

    public RevisorRevisionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RevisorRevisionDTO setRevision(final RevisionDTO revision) {
        this.revision = UtilObject.getDefault(revision, RevisionDTO.create());
        return this;
    }

    public RevisorRevisionDTO setRevisor(final RevisorDTO revisor) {
        this.revisor = UtilObject.getDefault(revisor, RevisorDTO.create());
        return this;
    }

    public RevisorRevisionDTO setFechaAsignacionRevision(final LocalDateTime fechaAsignacionRevision) {
        this.fechaAsignacionRevision = UtilDate.getDefault(fechaAsignacionRevision);
        return this;
    }

    public RevisorRevisionDTO setFechaCompletitudRevision(final LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
        return this;
    }

    public RevisorRevisionDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static RevisorRevisionDTO create (){
        return new RevisorRevisionDTO();
    }
}
