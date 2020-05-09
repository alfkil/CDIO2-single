package rest;

import javax.ws.rs.*;

@Path("/ingredient")
public class IngredientResource {
    @POST
    @Path("/form")
    public String createIngredient(@FormParam("id") String id, @FormParam("name") String name, @FormParam("amount") String amount) {
        return "Ingredient added : " + id + " " + name + " " + amount;
    }

    @POST
    @Path("/query")
    public String queryCreateIngredient(@QueryParam("id") String id, @QueryParam("name") String name, @QueryParam("amount") String amount) {
        return "Ingredient added : " + id + " " + name + " " + amount;
    }

    @POST
    @Path("/path/{id}/{name}/{amount}")
    public String pathCreateIngredient(@PathParam("id") String id, @PathParam("name") String name, @PathParam("amount") String amount) {
        return "Ingredient added : " + id + " " + name + " " + amount;
    }
}