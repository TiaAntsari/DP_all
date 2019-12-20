package pizza;

public class PizaaFruitMer extends Pizza{
    public PizaaFruitMer() {
        description="Pizza au Fruit de mer";
    }

    @Override
    public void cuire() {
        System.out.println("Cuire en 20 min");
    }

    @Override
    public void embaler() {
        System.out.println("Emballage compliqué");
    }

    @Override
    public void preparer() {
        System.out.println("Préparation en 50 min");
    }

    @Override
    public void couper() {
        System.out.println("decoupe en 8 morceaux");
    }
}
