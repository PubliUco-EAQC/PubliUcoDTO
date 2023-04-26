package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class PlanPublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoDTO estado;

    public PlanPublicacionDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPublicacion(new PublicacionDTO());
        setPrecio(UtilNumber.getRealDefaultValue());
        setFechaDesde(UtilDate.getDefault());
        setFechaHasta(UtilDate.getDefault());
        setEstado(new EstadoDTO());
    }

    public PlanPublicacionDTO(UUID identificador, PublicacionDTO publicacion, double precio, LocalDateTime fechaDesde, LocalDateTime fechaHasta, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setPrecio(precio);
        setFechaDesde(fechaDesde);
        setFechaHasta(fechaHasta);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDateTime getFechaDesde() {
        return fechaDesde;
    }

    public LocalDateTime getFechaHasta() {
        return fechaHasta;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public PlanPublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PlanPublicacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public PlanPublicacionDTO setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public PlanPublicacionDTO setFechaDesde(LocalDateTime fechaDesde) {
        this.fechaDesde = fechaDesde;
        return this;
    }

    public PlanPublicacionDTO setFechaHasta(LocalDateTime fechaHasta) {
        this.fechaHasta = fechaHasta;
        return this;
    }

    public PlanPublicacionDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
