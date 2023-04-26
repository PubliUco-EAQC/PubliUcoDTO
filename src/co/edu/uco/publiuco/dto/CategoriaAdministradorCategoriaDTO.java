package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;
public final class CategoriaAdministradorCategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private AdministradorCategoriaDTO administradorCategoria;

	public CategoriaAdministradorCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(new CategoriaDTO());
		setAdministradorCategoria(new AdministradorCategoriaDTO());
	}


	public CategoriaAdministradorCategoriaDTO(UUID identificador, CategoriaDTO categoria, AdministradorCategoriaDTO administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}

	public final CategoriaAdministradorCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final CategoriaAdministradorCategoriaDTO setCategoria(final CategoriaDTO categoria) {
		this.categoria = categoria;
		return this;
	}

	public final CategoriaAdministradorCategoriaDTO setAdministradorCategoria(final AdministradorCategoriaDTO administradorCategoria) {

		this.administradorCategoria = administradorCategoria;
		return this;
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public AdministradorCategoriaDTO getAdministradorCategoria() {
		return administradorCategoria;
	}

	@Override
	public String toString() {
		return "EstadoTipoRelacionInstitucionDTO [identificador="+identificador+"]";
	}
	public static CategoriaAdministradorCategoriaDTO create (){
		return new CategoriaAdministradorCategoriaDTO();
	}
}