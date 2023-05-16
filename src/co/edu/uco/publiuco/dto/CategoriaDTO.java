package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class CategoriaDTO {
    private UUID identificador;
    private CategoriaDTO categoriaPadre;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;

    public CategoriaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoriaPadre(CategoriaDTO.create());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
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

    public CategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public CategoriaDTO setCategoriaPadre(final CategoriaDTO categoriaPadre) {
        this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDTO.create());
        return this;
    }

    public CategoriaDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public CategoriaDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public CategoriaDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static CategoriaDTO create (){
        return new CategoriaDTO();
    }
}
