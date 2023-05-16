package co.edu.uco.publiuco.dto;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class AdministradorCategoriaDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;
    public AdministradorCategoriaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaDTO.create());
        setEstado(EstadoDTO.create());
    }


    public AdministradorCategoriaDTO(UUID identificador, PersonaDTO persona, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setPersona(persona);
        setEstado(estado);
    }

    public final AdministradorCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final AdministradorCategoriaDTO setPersona(final PersonaDTO datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaDTO.create());
        return this;
    }

    public final AdministradorCategoriaDTO setEstado(final EstadoDTO estado) {

        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final PersonaDTO getPersona() {
        return datosPersona;
    }

    public final EstadoDTO getEstado() {
        return estado;
    }

    public static AdministradorCategoriaDTO create (){
        return new AdministradorCategoriaDTO();
    }
}
