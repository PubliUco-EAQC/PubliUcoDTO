package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class TipoReporteDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    public TipoReporteDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoReporteDTO(UUID identificador, String nombre, String descripcion) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public TipoReporteDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoReporteDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoReporteDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }
    public static TipoReporteDTO create (){
        return new TipoReporteDTO();
    }


}

