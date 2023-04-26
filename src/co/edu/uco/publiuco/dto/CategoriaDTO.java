package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class CategoriaDTO {
    private UUID identificador;
    private CategoriaDTO categoriaPadre;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;
    public CategoriaDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setCategoriaPadre(new CategoriaDTO());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(new EstadoDTO());
    }

    public CategoriaDTO(UUID identificador, CategoriaDTO categoriaPadre, String nombre, String descripcion, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setCategoriaPadre(categoriaPadre);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaDTO getCategoriaPadre() {
        return categoriaPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public CategoriaDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public CategoriaDTO setCategoriaPadre(CategoriaDTO categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
        return this;
    }

    public CategoriaDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public CategoriaDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public CategoriaDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
