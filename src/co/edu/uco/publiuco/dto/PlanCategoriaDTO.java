package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;
import java.time.LocalDateTime;

public class PlanCategoriaDTO {
    private UUID identificador;
    private CategoriaDTO categoria;
    private double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoDTO estado;

    public PlanCategoriaDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setCategoria(new CategoriaDTO());
        setPrecio(UtilNumber.getIntegerDefaultValue());
        setFechaDesde(UtilDate.getDefault());
        setFechaHasta(UtilDate.getDefault());
        setEstado(new EstadoDTO());
    }

    public PlanCategoriaDTO(UUID identificador, CategoriaDTO categoria, double precio, LocalDateTime fechaDesde, LocalDateTime fechaHasta, EstadoDTO estado) {
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

    public PlanCategoriaDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PlanCategoriaDTO setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
        return this;
    }

    public PlanCategoriaDTO setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public PlanCategoriaDTO setFechaDesde(LocalDateTime fechaDesde) {
        this.fechaDesde = fechaDesde;
        return this;
    }

    public PlanCategoriaDTO setFechaHasta(LocalDateTime fechaHasta) {
        this.fechaHasta = fechaHasta;
        return this;
    }

    public PlanCategoriaDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
