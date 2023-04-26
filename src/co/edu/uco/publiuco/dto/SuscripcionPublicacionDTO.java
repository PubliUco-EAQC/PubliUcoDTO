package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class SuscripcionPublicacionDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private PlanPublicacionDTO planPublicacion;

    public SuscripcionPublicacionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPerfil(new PerfilDTO());
        setPlanPublicacion(new PlanPublicacionDTO());
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

    public SuscripcionPublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public SuscripcionPublicacionDTO setPerfil(PerfilDTO perfil) {
        this.perfil = perfil;
        return this;
    }

    public SuscripcionPublicacionDTO setPlanPublicacion(PlanPublicacionDTO planPublicacion) {
        this.planPublicacion = planPublicacion;
        return this;
    }
}
