import fabriques.FabriquePizza;
import pizza.Pizza;

public class Pizzeria {
    private FabriquePizza fabriquePizza;

    public Pizzeria(FabriquePizza fabriquePizza) {
        this.fabriquePizza = fabriquePizza;
    }
    public Pizza commanderPizza(String type){
        Pizza pizza=fabriquePizza.creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.embaler();
        return pizza;
    }
}
