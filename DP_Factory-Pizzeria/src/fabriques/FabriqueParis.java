package fabriques;

import pizza.PizaaFruitMer;
import pizza.PizaaParizienne;
import pizza.Pizza;
import pizza.PizzaFromage;

public class FabriqueParis implements FabriquePizza {
    @Override
    public Pizza creerPizza(String type) {
        Pizza p=null;
        switch (type){
            case "fromage": p=new PizzaFromage();
            case "fruit" : p= new PizaaFruitMer();
            case "parizienne": p=new PizaaParizienne();
        }
        return p;
    }
}
