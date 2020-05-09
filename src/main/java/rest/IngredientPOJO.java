package rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IngredientPOJO {
    private String id;
    private String name;
    private String amount;

    public IngredientPOJO() {}
    public IngredientPOJO(String id, String name, String amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    //getters og setters...
}
