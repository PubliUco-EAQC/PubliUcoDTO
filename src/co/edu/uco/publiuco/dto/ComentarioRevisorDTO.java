package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class ComentarioRevisorDTO {
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
        setIdentificador(UtilUUID.getDefaultValue());
        setRevisorRevision(RevisorRevisionDTO.create());
        setTipoComentarioRevisor(TipoComentarioRevisorDTO.create());
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

    public ComentarioRevisorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ComentarioRevisorDTO setRevisorRevision(final RevisorRevisionDTO revisorRevision) {
        this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionDTO.create());
        return this;
    }

    public ComentarioRevisorDTO setTipoComentarioRevisor(final TipoComentarioRevisorDTO tipoComentarioRevisor) {
        this.tipoComentarioRevisor = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorDTO.create());
        return this;
    }

    public ComentarioRevisorDTO setComentario(final String comentario) {
        this.comentario = UtilText.applyTrim(comentario);
        return this;
    }
    public static ComentarioRevisorDTO create (){
        return new ComentarioRevisorDTO();
    }
}
