package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class SuscripcionCategoriaDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private PlanCategoriaDTO planCategoria;

    public SuscripcionCategoriaDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPerfil(new PerfilDTO());
        setPlanCategoria(new PlanCategoriaDTO());
    }

    public SuscripcionCategoriaDTO(UUID identificador, PerfilDTO perfil, PlanCategoriaDTO planCategoria) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setPlanCategoria(planCategoria);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilDTO getPerfil() {
        return perfil;
    }

    public PlanCategoriaDTO getPlanCategoria() {
        return planCategoria;
    }

    public SuscripcionCategoriaDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public SuscripcionCategoriaDTO setPerfil(PerfilDTO perfil) {
        this.perfil = perfil;
        return this;
    }

    public SuscripcionCategoriaDTO setPlanCategoria(PlanCategoriaDTO planCategoria) {
        this.planCategoria = planCategoria;
        return this;
    }
}
