package sistemas.backend.business;

import java.util.List;

import javax.inject.Inject;

import sistemas.backend.dao.UsuarioDAO;
import sistemas.backend.entity.Usuario;

public class UsuarioBC {

	@Inject
	private UsuarioDAO usuarioDAO;

	public List<Usuario> listarUsuarios() {

		return usuarioDAO.listarUsuarios();

	}

}
