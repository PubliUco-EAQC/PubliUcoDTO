package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class EscritorPublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private EscritorDTO escritor;
    private TipoEscritorDTO tipoEscritor;

    public EscritorPublicacionDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPublicacion(new PublicacionDTO());
        setEscritor(new EscritorDTO());
        setTipoEscritor(new TipoEscritorDTO());
    }

    public EscritorPublicacionDTO(UUID identificador, PublicacionDTO publicacion, EscritorDTO escritor, TipoEscritorDTO tipoEscritor) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setEscritor(escritor);
        setTipoEscritor(tipoEscritor);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public EscritorDTO getEscritor() {
        return escritor;
    }

    public TipoEscritorDTO getTipoEscritor() {
        return tipoEscritor;
    }

    public EscritorPublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public EscritorPublicacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public EscritorPublicacionDTO setEscritor(EscritorDTO escritor) {
        this.escritor = escritor;
        return this;
    }

    public EscritorPublicacionDTO setTipoEscritor(TipoEscritorDTO tipoEscritor) {
        this.tipoEscritor = tipoEscritor;
        return this;
    }
}
