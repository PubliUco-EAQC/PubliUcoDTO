package co.edu.uco.publiuco.dto;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
//askdfjpaoisdf
import java.util.UUID;

public final class AdministradorCategoriaDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;
    public AdministradorCategoriaDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setPersona(new PersonaDTO());
        setEstado(new EstadoDTO());
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
        this.datosPersona = datosPersona;
        return this;
    }

    public final AdministradorCategoriaDTO setEstado(final EstadoDTO estado) {

        this.estado = estado;
        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final PersonaDTO getNombre() {
        return datosPersona;
    }

    public final EstadoDTO getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "EstadoTipoRelacionInstitucionDTO [identificador="+identificador+"]";
    }
    public static AdministradorCategoriaDTO create (){
        return new AdministradorCategoriaDTO();
    }
}
