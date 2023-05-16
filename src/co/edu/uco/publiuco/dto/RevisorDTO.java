package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class RevisorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;

    public RevisorDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaDTO.create());
        setEstado(EstadoDTO.create());
    }
    public RevisorDTO(UUID identificador, PersonaDTO datosPersona, EstadoDTO estado) {
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaDTO getDatosPersona() {
        return datosPersona;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public RevisorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RevisorDTO setDatosPersona(final PersonaDTO datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaDTO.create());
        return this;
    }

    public RevisorDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static RevisorDTO create (){
        return new RevisorDTO();
    }
}
