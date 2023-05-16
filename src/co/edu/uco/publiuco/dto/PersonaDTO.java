package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class PersonaDTO {
    private UUID identificador;
    private TipoIdentificacionDTO tipoIdentificacionDTO;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;
    private PaisDTO indicadorPais;
    private String numeroTelefonoMovil;
    private EstadoDTO estado;
    private TipoRelacionInstitucionDTO tipoRelacionInstitucion;

    public PersonaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setTipoIdentificacionDTO(TipoIdentificacionDTO.create());
        setNumeroIdentificacion(UtilText.getDefaultValue());
        setPrimerNombre(UtilText.getDefaultValue());
        setSegundoNombre(UtilText.getDefaultValue());
        setPrimerApellido(UtilText.getDefaultValue());
        setSegundoApellido(UtilText.getDefaultValue());
        setCorreoElectronico(UtilText.getDefaultValue());
        setIndicadorPais(PaisDTO.create());
        setNumeroTelefonoMovil(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public PersonaDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacionDTO, String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correoElectronico, PaisDTO indicadorPais, String numeroTelefonoMovil, EstadoDTO estado, TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacionDTO(tipoIdentificacionDTO);
        setNumeroIdentificacion(numeroIdentificacion);
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
        setCorreoElectronico(correoElectronico);
        setIndicadorPais(indicadorPais);
        setNumeroTelefonoMovil(numeroTelefonoMovil);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public TipoIdentificacionDTO getTipoIdentificacionDTO() {
        return tipoIdentificacionDTO;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public PaisDTO getIndicadorPais() {
        return indicadorPais;
    }

    public String getNumeroTelefonoMovil() {
        return numeroTelefonoMovil;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
    }

    public PersonaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PersonaDTO setTipoIdentificacionDTO(final TipoIdentificacionDTO tipoIdentificacionDTO) {
        this.tipoIdentificacionDTO = UtilObject.getDefault(tipoIdentificacionDTO, TipoIdentificacionDTO.create());
        return this;
    }

    public PersonaDTO setNumeroIdentificacion(final String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.applyTrim(numeroIdentificacion);
        return this;
    }

    public PersonaDTO setPrimerNombre(final String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
        return this;
    }

    public PersonaDTO setSegundoNombre(final String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
        return this;
    }

    public PersonaDTO setPrimerApellido(final String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
        return this;
    }

    public PersonaDTO setSegundoApellido(final String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
        return this;
    }

    public PersonaDTO setCorreoElectronico(final String correoElectronico) {
        this.correoElectronico = UtilText.applyTrim(correoElectronico);
        return this;
    }

    public PersonaDTO setIndicadorPais(final PaisDTO indicadorPais) {
        this.indicadorPais = UtilObject.getDefault(indicadorPais, PaisDTO.create());
        return this;
    }

    public PersonaDTO setNumeroTelefonoMovil(final String numeroTelefonoMovil) {
        this.numeroTelefonoMovil = UtilText.applyTrim(numeroTelefonoMovil);
        return this;
    }

    public PersonaDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public PersonaDTO setTipoRelacionInstitucion(final TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionDTO.create());
        return this;
    }
    public static PersonaDTO create (){
        return new PersonaDTO();
    }
}
