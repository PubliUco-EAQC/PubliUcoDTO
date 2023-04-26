package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class ComentarioRevisorDTO {
    private UUID identificador;
    private RevisorRevisionDTO revisorRevision;
    private TipoComentarioRevisorDTO tipoComentarioRevisor;
    private String comentario;

    public ComentarioRevisorDTO(UUID identificador, RevisorRevisionDTO revisorRevision, TipoComentarioRevisorDTO tipoComentarioRevisor, String comentario) {
        super();
        setIdentificador(identificador);
        setRevisorRevision(revisorRevision);
        setTipoComentarioRevisor(tipoComentarioRevisor);
        setComentario(comentario);

    }
    public ComentarioRevisorDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setRevisorRevision(new RevisorRevisionDTO());
        setTipoComentarioRevisor(new TipoComentarioRevisorDTO());
        setComentario(UtilText.getDefaultValue());

    }

    public UUID getIdentificador() {
        return identificador;
    }

    public RevisorRevisionDTO getRevisorRevision() {
        return revisorRevision;
    }

    public TipoComentarioRevisorDTO getTipoComentarioRevisor() {
        return tipoComentarioRevisor;
    }

    public String getComentario() {
        return comentario;
    }

    public ComentarioRevisorDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public ComentarioRevisorDTO setRevisorRevision(RevisorRevisionDTO revisorRevision) {
        this.revisorRevision = revisorRevision;
        return this;
    }

    public ComentarioRevisorDTO setTipoComentarioRevisor(TipoComentarioRevisorDTO tipoComentarioRevisor) {
        this.tipoComentarioRevisor = tipoComentarioRevisor;
        return this;
    }

    public ComentarioRevisorDTO setComentario(String comentario) {
        this.comentario = UtilText.applyTrim(comentario);
        return this;
    }
}
