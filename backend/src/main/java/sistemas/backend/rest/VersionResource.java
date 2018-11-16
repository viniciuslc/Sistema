package sistemas.backend.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/version")
public class VersionResource {

	@GET
	@Path("/")
	// @Produces("application/json")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response get() {
		return Response.ok(new Version("1.0.0-SNAPSHOT")).build();
	}

}

class Version {

	private String number;

	public Version() {
	}

	public Version(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}