package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class VersionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private VersionDTO versionAnterior;
    private int numeroVersion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaFechaModificacion;
    private String titulo;
    private String resumen;
    private String cuerpo;
    private EstadoDTO estado;

    public VersionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPublicacion(new PublicacionDTO());
        setVersionAnterior(new VersionDTO());
        setNumeroVersion(UtilNumber.getIntegerDefaultValue());
        setFechaCreacion(UtilDate.getDefaultValue());
        setUltimaFechaModificacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setResumen(UtilText.getDefaultValue());
        setCuerpo(UtilText.getDefaultValue());
        setEstado(new EstadoDTO());
    }
    public VersionDTO(UUID identificador, PublicacionDTO publicacion, VersionDTO versionAnterior, int numeroVersion, LocalDateTime fechaCreacion, LocalDateTime ultimaFechaModificacion, String titulo, String resumen, String cuerpo, EstadoDTO estado) {
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setVersionAnterior(versionAnterior);
        setNumeroVersion(numeroVersion);
        setFechaCreacion(fechaCreacion);
        setUltimaFechaModificacion(ultimaFechaModificacion);
        setTitulo(titulo);
        setResumen(resumen);
        setCuerpo(cuerpo);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public VersionDTO getVersionAnterior() {
        return versionAnterior;
    }

    public int getNumeroVersion() {
        return numeroVersion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getUltimaFechaModificacion() {
        return ultimaFechaModificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public VersionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public VersionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public VersionDTO setVersionAnterior(VersionDTO versionAnterior) {
        this.versionAnterior = versionAnterior;
        return this;
    }

    public VersionDTO setNumeroVersion(int numeroVersion) {
        this.numeroVersion = numeroVersion;
        return this;
    }

    public VersionDTO setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        return this;
    }

    public VersionDTO setUltimaFechaModificacion(LocalDateTime ultimaFechaModificacion) {
        this.ultimaFechaModificacion = ultimaFechaModificacion;
        return this;
    }

    public VersionDTO setTitulo(String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
        return this;
    }

    public VersionDTO setResumen(String resumen) {
        this.resumen = UtilText.applyTrim(resumen);
        return this;
    }

    public VersionDTO setCuerpo(String cuerpo) {
        this.cuerpo = UtilText.applyTrim(cuerpo);
        return this;
    }

    public VersionDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
