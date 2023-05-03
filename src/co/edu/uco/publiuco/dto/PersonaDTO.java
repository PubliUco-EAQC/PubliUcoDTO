package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class PersonaDTO {
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
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setTipoIdentificacionDTO(new TipoIdentificacionDTO());
        setNumeroIdentificacion(UtilText.getDefaultValue());
        setPrimerNombre(UtilText.getDefaultValue());
        setSegundoNombre(UtilText.getDefaultValue());
        setPrimerApellido(UtilText.getDefaultValue());
        setSegundoApellido(UtilText.getDefaultValue());
        setCorreoElectronico(UtilText.getDefaultValue());
        setIndicadorPais(new PaisDTO());
        setNumeroTelefonoMovil(UtilText.getDefaultValue());
        setEstado(new EstadoDTO());
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

    public PersonaDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PersonaDTO setTipoIdentificacionDTO(TipoIdentificacionDTO tipoIdentificacionDTO) {
        this.tipoIdentificacionDTO = tipoIdentificacionDTO;
        return this;
    }

    public PersonaDTO setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.applyTrim(numeroIdentificacion);
        return this;
    }

    public PersonaDTO setPrimerNombre(String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
        return this;
    }

    public PersonaDTO setSegundoNombre(String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
        return this;
    }

    public PersonaDTO setPrimerApellido(String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
        return this;
    }

    public PersonaDTO setSegundoApellido(String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
        return this;
    }

    public PersonaDTO setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = UtilText.applyTrim(correoElectronico);
        return this;
    }

    public PersonaDTO setIndicadorPais(PaisDTO indicadorPais) {
        this.indicadorPais = indicadorPais;
        return this;
    }

    public PersonaDTO setNumeroTelefonoMovil(String numeroTelefonoMovil) {
        this.numeroTelefonoMovil = UtilText.applyTrim(numeroTelefonoMovil);
        return this;
    }

    public PersonaDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }

    public PersonaDTO setTipoRelacionInstitucion(TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = tipoRelacionInstitucion;
        return this;
    }
}
