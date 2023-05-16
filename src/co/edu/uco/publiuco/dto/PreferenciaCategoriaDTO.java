package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PreferenciaCategoriaDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private CategoriaDTO categoria;

    public PreferenciaCategoriaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilDTO.create());
        setCategoria(CategoriaDTO.create());
    }

    public PreferenciaCategoriaDTO(UUID identificador, PerfilDTO perfil, CategoriaDTO categoria) {
     super();
     setIdentificador(identificador);
     setPerfil(perfil);
     setCategoria(categoria);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilDTO getPerfil() {
        return perfil;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public PreferenciaCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PreferenciaCategoriaDTO setPerfil(final PerfilDTO perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
        return this;
    }

    public PreferenciaCategoriaDTO setCategoria(final CategoriaDTO categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
        return this;
    }
    public static PreferenciaCategoriaDTO create (){
        return new PreferenciaCategoriaDTO();
    }
}
