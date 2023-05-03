package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class PaisDTO {
    private UUID identificador;
    private String nombre;
    private String indicadorPais;

    public PaisDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setIndicadorPais(UtilText.getDefaultValue());
    }

    public PaisDTO(UUID identificador, String nombre, String indicadorPais) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setIndicadorPais(indicadorPais);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIndicadorPais() {
        return indicadorPais;
    }

    public PaisDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PaisDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public PaisDTO setIndicadorPais(final String indicadorPais) {
        this.indicadorPais = UtilText.applyTrim(indicadorPais);
        return this;
    }
    public static PaisDTO create (){
        return new PaisDTO();
    }
}
