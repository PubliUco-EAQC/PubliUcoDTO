package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class RevisionDTO {
    private UUID identificador;
    private VersionDTO version;
    private TipoRevisionDTO tipoRevision;
    private LocalDateTime fechaSolicitudRevision;
    private LocalDateTime fechaLimiteRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoDTO estado;

    public RevisionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setVersion(new VersionDTO());
        setTipoRevision(new TipoRevisionDTO());
        setFechaSolicitudRevision(UtilDate.getDefault());
        setFechaLimiteRevision(UtilDate.getDefault());
        setFechaCompletitudRevision(UtilDate.getDefault());
        setEstado(new EstadoDTO());
    }
    public RevisionDTO(UUID identificador, VersionDTO version, TipoRevisionDTO tipoRevision, LocalDateTime fechaSolicitudRevision, LocalDateTime fechaLimiteRevision, LocalDateTime fechaCompletitudRevision, EstadoDTO estado) {
        setIdentificador(identificador);
        setVersion(version);
        setTipoRevision(tipoRevision);
        setFechaSolicitudRevision(fechaSolicitudRevision);
        setFechaLimiteRevision(fechaLimiteRevision);
        setFechaCompletitudRevision(fechaCompletitudRevision);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public VersionDTO getVersion() {
        return version;
    }

    public TipoRevisionDTO getTipoRevision() {
        return tipoRevision;
    }

    public LocalDateTime getFechaSolicitudRevision() {
        return fechaSolicitudRevision;
    }

    public LocalDateTime getFechaLimiteRevision() {
        return fechaLimiteRevision;
    }

    public LocalDateTime getFechaCompletitudRevision() {
        return fechaCompletitudRevision;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public RevisionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public RevisionDTO setVersion(VersionDTO version) {
        this.version = version;
        return this;
    }

    public RevisionDTO setTipoRevision(TipoRevisionDTO tipoRevision) {
        this.tipoRevision = tipoRevision;
        return this;
    }

    public RevisionDTO setFechaSolicitudRevision(LocalDateTime fechaSolicitudRevision) {
        this.fechaSolicitudRevision = fechaSolicitudRevision;
        return this;
    }

    public RevisionDTO setFechaLimiteRevision(LocalDateTime fechaLimiteRevision) {
        this.fechaLimiteRevision = fechaLimiteRevision;
        return this;
    }

    public RevisionDTO setFechaCompletitudRevision(LocalDateTime fechaCompletitudRevision) {
        this.fechaCompletitudRevision = fechaCompletitudRevision;
        return this;
    }

    public RevisionDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
