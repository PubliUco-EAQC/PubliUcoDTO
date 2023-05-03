package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;
public final class CategoriaAdministradorCategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private AdministradorCategoriaDTO administradorCategoria;

	public CategoriaAdministradorCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setCategoria(CategoriaDTO.create());
		setAdministradorCategoria(AdministradorCategoriaDTO.create());
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
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}

	public final CategoriaAdministradorCategoriaDTO setAdministradorCategoria(final AdministradorCategoriaDTO administradorCategoria) {

		this.administradorCategoria = UtilObject.getDefault(administradorCategoria, AdministradorCategoriaDTO.create());
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

	public static CategoriaAdministradorCategoriaDTO create (){
		return new CategoriaAdministradorCategoriaDTO();
	}
}