package example;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/echo")
@Produces(MediaType.APPLICATION_JSON)
public class EchoResource {
    @POST
    public EchoRequest echo(EchoRequest echoRequest) {
        return echoRequest;
    }
}
