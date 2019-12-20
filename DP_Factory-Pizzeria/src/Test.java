import fabriques.FabriqueCasa;
import pizza.Pizza;

public class Test {
    public static void main(String[] args) {
        Pizzeria pizzeria=new Pizzeria(new FabriqueCasa());
        Pizza pizza=pizzeria.commanderPizza("fromage");
        System.out.println(pizza.getDescription());
    }
}
