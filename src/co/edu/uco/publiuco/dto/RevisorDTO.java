package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class RevisorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;

    public RevisorDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setDatosPersona(new PersonaDTO());
        setEstado(new EstadoDTO());
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

    public RevisorDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public RevisorDTO setDatosPersona(PersonaDTO datosPersona) {
        this.datosPersona = datosPersona;
        return this;
    }

    public RevisorDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
