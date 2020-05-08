package rest;

import javax.ws.rs.*;

@Path("/hello")
public class HelloResource {

    @GET
    @Path("/hello")
    public String helloworld() {
        return "Hello World!";
    }
    @POST
    @Path("/greeting")
    @Consumes("text/plain")
    @Produces("text/plain")
    public String postHtml(String message) {
        // Store the message
        return "Hello " + message;
    }

    @POST
    @Path("/ingredient/form")
    public String createIngredient(@FormParam("id") String id, @FormParam("name") String name, @FormParam("amount") String amount) {
        return "Ingredient added : " + id + " " + name + " " + amount;
    }

    @POST
    @Path("/ingredient/query")
    public String queryCreateIngredient(@QueryParam("id") String id, @QueryParam("name") String name, @QueryParam("amount") String amount) {
        return "Ingredient added : " + id + " " + name + " " + amount;
    }

    @POST
    @Path("/ingredient/path/{id}/{name}/{amount}")
    public String pathCreateIngredient(@PathParam("id") String id, @PathParam("name") String name, @PathParam("amount") String amount) {
        return "Ingredient added : " + id + " " + name + " " + amount;
    }
}