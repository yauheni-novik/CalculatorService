package wkl.training.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import wkl.training.exception.InvalidDataException;

@Path("/calc")
@WebService
public interface Calculator {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{firstOperand}/{secondOperand}/{operator}")
	@WebMethod
	public @WebResult(name = "result")
	double calculate(@WebParam(name = "firstOperand")@PathParam("firstOperand") int firstOperand,
			@WebParam(name = "secondOperand")@PathParam("secondOperand") int secondOperand,
			@WebParam(name = "operator")@PathParam("operator") String operator) throws Exception;
}
