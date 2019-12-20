package fabriques;

import pizza.PizaaFruitMer;
import pizza.Pizza;
import pizza.PizzaFromage;

public class FabriqueCasa implements FabriquePizza {
    @Override
    public Pizza creerPizza(String type) {
        switch (type){
            case "fromage": return new PizzaFromage();
            case "fruit" : return new PizaaFruitMer();
        }
        return null;
    }
}
