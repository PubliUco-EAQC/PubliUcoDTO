package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class PalabraClavePublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private String palabraClave;

    public PalabraClavePublicacionDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPublicacion(new PublicacionDTO());
        setPalabraClave(UtilText.getDefaultValue());
    }

    public PalabraClavePublicacionDTO(UUID identificador, PublicacionDTO publicacion, String palabraClave) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setPalabraClave(palabraClave);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public PalabraClavePublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PalabraClavePublicacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public PalabraClavePublicacionDTO setPalabraClave(String palabraClave) {
        this.palabraClave = UtilText.applyTrim(palabraClave);
        return this;
    }
}
