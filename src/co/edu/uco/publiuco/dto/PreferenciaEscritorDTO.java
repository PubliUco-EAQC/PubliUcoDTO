package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class PreferenciaEscritorDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private EscritorDTO escritor;

    public PreferenciaEscritorDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPerfil(new PerfilDTO());
        setEscritor(new EscritorDTO());
    }
    public PreferenciaEscritorDTO(UUID identificador, PerfilDTO perfil, EscritorDTO escritor) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setEscritor(escritor);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilDTO getPerfil() {
        return perfil;
    }

    public EscritorDTO getEscritor() {
        return escritor;
    }

    public PreferenciaEscritorDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PreferenciaEscritorDTO setPerfil(PerfilDTO perfil) {
        this.perfil = perfil;
        return this;
    }

    public PreferenciaEscritorDTO setEscritor(EscritorDTO escritor) {
        this.escritor = escritor;
        return this;
    }
}
