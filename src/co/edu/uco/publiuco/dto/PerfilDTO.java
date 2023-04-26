package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class PerfilDTO {
    private UUID identificador;
    private LectorDTO lector;
    private RespuestaDTO deseaRecibirRecomendacionesDeCategoria;
    private RespuestaDTO deseaRecibirRecomendacionesDeAutor;

    public PerfilDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setLector(new LectorDTO());
        setDeseaRecibirRecomendacionesDeCategoria(new RespuestaDTO());
        setDeseaRecibirRecomendacionesDeAutor(new RespuestaDTO());
    }

    public PerfilDTO(UUID identificador, LectorDTO lector, RespuestaDTO deseaRecibirRecomendacionesDeCategoria, RespuestaDTO deseaRecibirRecomendacionesDeAutor) {
       super();
       setIdentificador(identificador);
       setLector(lector);
       setDeseaRecibirRecomendacionesDeCategoria(deseaRecibirRecomendacionesDeCategoria);
       setDeseaRecibirRecomendacionesDeAutor(deseaRecibirRecomendacionesDeAutor);
    }

    public UUID getIdentificador(){
        return identificador;
    }

    public LectorDTO getLector() {
        return lector;
    }

    public RespuestaDTO getDeseaRecibirRecomendacionesDeCategoria() {
        return deseaRecibirRecomendacionesDeCategoria;
    }

    public RespuestaDTO getDeseaRecibirRecomendacionesDeAutor() {
        return deseaRecibirRecomendacionesDeAutor;
    }

    public PerfilDTO setIdentificador(UUID identificaodr) {
        this.identificador = identificador;
        return this;
    }

    public PerfilDTO setLector(LectorDTO lector) {
        this.lector = lector;
        return this;
    }

    public PerfilDTO setDeseaRecibirRecomendacionesDeCategoria(RespuestaDTO deseaRecibirRecomendacionesDeCategoria) {
        this.deseaRecibirRecomendacionesDeCategoria = deseaRecibirRecomendacionesDeCategoria;
        return this;
    }

    public PerfilDTO setDeseaRecibirRecomendacionesDeAutor(RespuestaDTO deseaRecibirRecomendacionesDeAutor) {
        this.deseaRecibirRecomendacionesDeAutor = deseaRecibirRecomendacionesDeAutor;
        return this;
    }
}
