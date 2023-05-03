package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class SuscripcionCategoriaDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private PlanCategoriaDTO planCategoria;

    public SuscripcionCategoriaDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilDTO.create());
        setPlanCategoria(PlanCategoriaDTO.create());
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

    public SuscripcionCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public SuscripcionCategoriaDTO setPerfil(final PerfilDTO perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
        return this;
    }

    public SuscripcionCategoriaDTO setPlanCategoria(final PlanCategoriaDTO planCategoria) {
        this.planCategoria = UtilObject.getDefault(planCategoria, PlanCategoriaDTO.create());
        return this;
    }
    public static SuscripcionCategoriaDTO create (){
        return new SuscripcionCategoriaDTO();
    }
}
