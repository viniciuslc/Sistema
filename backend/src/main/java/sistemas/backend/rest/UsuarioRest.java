package sistemas.backend.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import sistemas.backend.business.UsuarioBC;
import sistemas.backend.entity.Usuario;

/**
 * REST dados do usuario
 * 
 * 
 * @since 28/11/2018
 * @author Vinicius
 */
@ApplicationScoped
@Path("backend")
// @Authenticated
public class UsuarioRest {

	@Inject
	UsuarioBC usuarioBC;

	@GET
	@Path("/usuario")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Usuario> listUsuarios() {
		return usuarioBC.listarUsuarios();
	}

	@GET
	@Path("/usuario/cod/{cod}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Usuario> listUsuariosPorCodigo(@PathParam("cod") int codigo) {
		return usuarioBC.listarUsuarios(codigo);
	}

}