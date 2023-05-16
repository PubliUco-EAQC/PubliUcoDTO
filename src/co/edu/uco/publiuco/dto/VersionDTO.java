package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.*;

import java.time.LocalDateTime;
import java.util.UUID;

public final class VersionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private VersionDTO versionAnterior;
    private Integer numeroVersion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaFechaModificacion;
    private String titulo;
    private String resumen;
    private String cuerpo;
    private EstadoDTO estado;

    private static final VersionDTO INSTANCE_DEFAULT = VersionDTO.create();


    public VersionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setVersionAnterior(getDefaultValue());
        setNumeroVersion(UtilNumber.getIntegerDefaultValue());
        setFechaCreacion(UtilDate.getDefaultValue());
        setUltimaFechaModificacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setResumen(UtilText.getDefaultValue());
        setCuerpo(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
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

    public static VersionDTO getDefaultValue() {
        return INSTANCE_DEFAULT;
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

    public Integer getNumeroVersion() {
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

    public VersionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public VersionDTO setPublicacion(final PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

    public VersionDTO setVersionAnterior(final VersionDTO versionAnterior) {
        this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionDTO.create());
        return this;
    }

    public VersionDTO setNumeroVersion(final Integer numeroVersion) {
        this.numeroVersion = UtilNumber.getDefaultInt(numeroVersion);
        return this;
    }

    public VersionDTO setFechaCreacion(final LocalDateTime fechaCreacion) {
        this.fechaCreacion = UtilDate.getDefault(fechaCreacion);
        return this;
    }

    public VersionDTO setUltimaFechaModificacion(final LocalDateTime ultimaFechaModificacion) {
        this.ultimaFechaModificacion = UtilDate.getDefault(ultimaFechaModificacion);
        return this;
    }

    public VersionDTO setTitulo(final String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
        return this;
    }

    public VersionDTO setResumen(final String resumen) {
        this.resumen = UtilText.applyTrim(resumen);
        return this;
    }

    public VersionDTO setCuerpo(final String cuerpo) {
        this.cuerpo = UtilText.applyTrim(cuerpo);
        return this;
    }

    public VersionDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static VersionDTO create (){
        return new VersionDTO();
    }
}
