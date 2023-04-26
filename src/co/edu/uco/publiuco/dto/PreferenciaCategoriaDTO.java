package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class PreferenciaCategoriaDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private CategoriaDTO categoria;

    public PreferenciaCategoriaDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPerfil(new PerfilDTO());
        setCategoria(new CategoriaDTO());
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

    public PreferenciaCategoriaDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PreferenciaCategoriaDTO setPerfil(PerfilDTO perfil) {
        this.perfil = perfil;
        return this;
    }

    public PreferenciaCategoriaDTO setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
        return this;
    }
}
