package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class LectorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;

    public LectorDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setDatosPersona(new PersonaDTO());
        setEstado(new EstadoDTO());
    }

    public LectorDTO(UUID identificador, PersonaDTO datosPersona, EstadoDTO estado) {
        super();
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

    public LectorDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public LectorDTO setDatosPersona(PersonaDTO datosPersona) {
        this.datosPersona = datosPersona;
        return this;
    }

    public LectorDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }
}
