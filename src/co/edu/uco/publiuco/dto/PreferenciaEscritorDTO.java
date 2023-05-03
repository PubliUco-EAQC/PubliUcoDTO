package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public final class PreferenciaEscritorDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private EscritorDTO escritor;

    public PreferenciaEscritorDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilDTO.create());
        setEscritor(EscritorDTO.create());
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

    public PreferenciaEscritorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PreferenciaEscritorDTO setPerfil(final PerfilDTO perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
        return this;
    }

    public PreferenciaEscritorDTO setEscritor(final EscritorDTO escritor) {
        this.escritor = UtilObject.getDefault(escritor, EscritorDTO.create());
        return this;
    }
    public static PreferenciaEscritorDTO create (){
        return new PreferenciaEscritorDTO();
    }
}
