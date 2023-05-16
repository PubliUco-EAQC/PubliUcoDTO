package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilNumber;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;
import java.time.LocalDateTime;

public final class PlanCategoriaDTO {
    private UUID identificador;
    private CategoriaDTO categoria;
    private Double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoDTO estado;

    public PlanCategoriaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoria(CategoriaDTO.create());
        setPrecio(UtilNumber.getRealDefaultValue());
        setFechaDesde(UtilDate.getDefaultValue());
        setFechaHasta(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public PlanCategoriaDTO(UUID identificador, CategoriaDTO categoria, Double precio, LocalDateTime fechaDesde, LocalDateTime fechaHasta, EstadoDTO estado) {
       super();
       setIdentificador(identificador);
       setCategoria(categoria);
       setPrecio(precio);
       setFechaDesde(fechaDesde);
       setFechaHasta(fechaHasta);
       setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
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

    public PlanCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PlanCategoriaDTO setCategoria(final CategoriaDTO categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
        return this;
    }

    public PlanCategoriaDTO setPrecio(final Double precio) {
        this.precio = UtilNumber.getDefaultReal(precio);
        return this;
    }

    public PlanCategoriaDTO setFechaDesde(final LocalDateTime fechaDesde) {
        this.fechaDesde = UtilDate.getDefault(fechaDesde);
        return this;
    }

    public PlanCategoriaDTO setFechaHasta(final LocalDateTime fechaHasta) {
        this.fechaHasta = UtilDate.getDefault(fechaHasta);
        return this;
    }

    public PlanCategoriaDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static PlanCategoriaDTO create (){
        return new PlanCategoriaDTO();
    }
}
