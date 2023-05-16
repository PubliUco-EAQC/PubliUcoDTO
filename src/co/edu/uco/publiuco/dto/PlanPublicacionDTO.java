package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilNumber;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class PlanPublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private Double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoDTO estado;

    public PlanPublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setPrecio(UtilNumber.getRealDefaultValue());
        setFechaDesde(UtilDate.getDefaultValue());
        setFechaHasta(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public PlanPublicacionDTO(UUID identificador, PublicacionDTO publicacion, Double precio, LocalDateTime fechaDesde, LocalDateTime fechaHasta, EstadoDTO estado) {
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

    public Double getPrecio() {
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

    public PlanPublicacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PlanPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

    public PlanPublicacionDTO setPrecio(final Double precio) {
        this.precio = UtilNumber.getDefaultReal(precio);
        return this;
    }

    public PlanPublicacionDTO setFechaDesde(final LocalDateTime fechaDesde) {
        this.fechaDesde = UtilDate.getDefault(fechaDesde);
        return this;
    }

    public PlanPublicacionDTO setFechaHasta(final LocalDateTime fechaHasta) {
        this.fechaHasta = UtilDate.getDefault(fechaHasta);
        return this;
    }

    public PlanPublicacionDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static PlanPublicacionDTO create (){
        return new PlanPublicacionDTO();
    }
}
