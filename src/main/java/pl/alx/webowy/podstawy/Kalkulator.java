package pl.alx.webowy.podstawy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/licz")
public class Kalkulator {

    @GET
    @Path("/{x}+{y}")
    public long dodaj(@PathParam("x") long a, @PathParam("y") long b) {
        return a+b;
    }
    
    @GET
    @Path("/{x}-{y}")
    public long odejmij(@PathParam("x") long a, @PathParam("y") long b) {
        return a-b;
    }
    
    @GET
    @Path("/{x}*{y}")
    public long pomnoz(@PathParam("x") long a, @PathParam("y") long b) {
        return a*b;
    }
    
    @GET
    @Path("/{x}/{y}")
    public long podziel(@PathParam("x") long a, @PathParam("y") long b) {
        return a/b;
    }
    
}
