package rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/ingredient")
public class IngredientService {
    static Map<Integer, IngredientPOJO> ingredients = new HashMap<>();

    //Insert some dummy data
    static {
        ingredients.put(1, new IngredientPOJO(1, "sukker", 200.0));
    }

//    //TODO: CRUD - methods below
    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean createIngredient(IngredientPOJO ingredient) {
        ingredients.put(ingredient.getId(), ingredient);
        return true;
    }

    @POST
    @Path("/read")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public IngredientPOJO readIngredient(IngredientPOJO ingredient) {
        return ingredients.get(ingredient.getId());
    }

    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean updateIngredient(IngredientPOJO ingredient) {
        IngredientPOJO i = ingredients.replace(ingredient.getId(), ingredient);
        return true;
    }

    @POST
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean deleteIngredient(IngredientPOJO ingredient) {
        ingredients.remove(ingredient.getId());
        return true;
    }
}