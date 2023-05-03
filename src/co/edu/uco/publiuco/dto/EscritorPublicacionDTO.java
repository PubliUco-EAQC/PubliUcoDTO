package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class EscritorPublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private EscritorDTO escritor;
    private TipoEscritorDTO tipoEscritor;

    public EscritorPublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setEscritor(EscritorDTO.create());
        setTipoEscritor(TipoEscritorDTO.create());
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

    public EscritorPublicacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EscritorPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

    public EscritorPublicacionDTO setEscritor(final EscritorDTO escritor) {
        this.escritor = UtilObject.getDefault(escritor, EscritorDTO.create());
        return this;
    }

    public EscritorPublicacionDTO setTipoEscritor(final TipoEscritorDTO tipoEscritor) {
        this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorDTO.create());
        return this;
    }
    public static EscritorPublicacionDTO create (){
        return new EscritorPublicacionDTO();
    }
}
