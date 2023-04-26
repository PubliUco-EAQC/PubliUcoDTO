package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class PublicacionDTO {
    private UUID identificador;
    private CategoriaDTO categoria;
    private TipoAccesoDTO tipoAcceso;
    private LocalDateTime fechaPublicacion;
    private VersionDTO versionPublicada;
    private EstadoDTO estado;

    public PublicacionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setCategoria(new CategoriaDTO());
        setTipoAcceso(new TipoAccesoDTO());
        setFechaPublicacion(UtilDate.getDefault());
        setVersionPublicada(new VersionDTO());
        setEstado(new EstadoDTO());
    }

    public PublicacionDTO(UUID identificador, CategoriaDTO categoria, TipoAccesoDTO tipoAcceso, LocalDateTime fechaPublicacion, VersionDTO versionPublicada, EstadoDTO estado) {
        setIdentificador(identificador);
        setCategoria(categoria);
        setTipoAcceso(tipoAcceso);
        setFechaPublicacion(fechaPublicacion);
        setVersionPublicada(versionPublicada);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public TipoAccesoDTO getTipoAcceso() {
        return tipoAcceso;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public VersionDTO getVersionPublicada() {
        return versionPublicada;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public PublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PublicacionDTO setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
        return this;
    }

    public PublicacionDTO setTipoAcceso(TipoAccesoDTO tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
        return this;
    }

    public PublicacionDTO setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
        return this;
    }

    public PublicacionDTO setVersionPublicada(VersionDTO versionPublicada) {
        this.versionPublicada = versionPublicada;
        return this;
    }

    public PublicacionDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
