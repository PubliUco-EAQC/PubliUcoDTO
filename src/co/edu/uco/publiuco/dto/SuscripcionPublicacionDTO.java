package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class SuscripcionPublicacionDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private PlanPublicacionDTO planPublicacion;

    public SuscripcionPublicacionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilDTO.create());
        setPlanPublicacion(PlanPublicacionDTO.create());
    }
    public SuscripcionPublicacionDTO(UUID identificador, PerfilDTO perfil, PlanPublicacionDTO planPublicacion) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setPlanPublicacion(planPublicacion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilDTO getPerfil() {
        return perfil;
    }

    public PlanPublicacionDTO getPlanPublicacion() {
        return planPublicacion;
    }

    public SuscripcionPublicacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public SuscripcionPublicacionDTO setPerfil(final PerfilDTO perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
        return this;
    }

    public SuscripcionPublicacionDTO setPlanPublicacion(final PlanPublicacionDTO planPublicacion) {
        this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionDTO.create());
        return this;
    }
    public static SuscripcionPublicacionDTO create (){
        return new SuscripcionPublicacionDTO();
    }
}
