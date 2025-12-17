package pl.alx.webowy.podstawy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloResource {
    @GET
    public String helloWorld() {
        return "Hello world";
    }
}
