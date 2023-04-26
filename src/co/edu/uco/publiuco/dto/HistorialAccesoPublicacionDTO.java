package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class HistorialAccesoPublicacionDTO {
    private UUID identificador;
    private LectorDTO lector;
    private PublicacionDTO publicacion;
    private LocalDateTime fechaAcceso;

    public HistorialAccesoPublicacionDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setLector(new LectorDTO());
        setPublicacion(new PublicacionDTO());
        setFechaAcceso(UtilDate.getDefault());
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

    public HistorialAccesoPublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public HistorialAccesoPublicacionDTO setLector(LectorDTO lector) {
        this.lector = lector;
        return this;
    }

    public HistorialAccesoPublicacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = publicacion;
        return this;
    }

    public HistorialAccesoPublicacionDTO setFechaAcceso(LocalDateTime fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
        return this;
    }
}
