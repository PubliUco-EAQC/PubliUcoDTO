package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public final class HistorialAccesoPublicacionDTO {
    private UUID identificador;
    private LectorDTO lector;
    private PublicacionDTO publicacion;
    private LocalDateTime fechaAcceso;

    public HistorialAccesoPublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorDTO.create());
        setPublicacion(PublicacionDTO.create());
        setFechaAcceso(UtilDate.getDefaultValue());
    }

    public HistorialAccesoPublicacionDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion, LocalDateTime fechaAcceso) {
        super();
        setIdentificador(identificador);
        setLector(lector);
        setPublicacion(publicacion);
        setFechaAcceso(fechaAcceso);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LectorDTO getLector() {
        return lector;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public LocalDateTime getFechaAcceso() {
        return fechaAcceso;
    }

    public HistorialAccesoPublicacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public HistorialAccesoPublicacionDTO setLector(final LectorDTO lector) {
        this.lector = UtilObject.getDefault(lector, LectorDTO.create());
        return this;
    }

    public HistorialAccesoPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

    public HistorialAccesoPublicacionDTO setFechaAcceso(final LocalDateTime fechaAcceso) {
        this.fechaAcceso = UtilDate.getDefault(fechaAcceso);
        return this;
    }
    public static HistorialAccesoPublicacionDTO create (){
        return new HistorialAccesoPublicacionDTO();
    }
}
