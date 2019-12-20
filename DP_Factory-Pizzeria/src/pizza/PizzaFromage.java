package pizza;

public class PizzaFromage extends Pizza {
	public PizzaFromage() {
		description = "Pizza au fromage";
	}

	@Override
	public void cuire() {
		System.out.println("Cuire en 15 min");
	}

	@Override
	public void embaler() {
		System.out.println("Emballage simple");
	}

	@Override
	public void preparer() {
		System.out.println("Préparation en 5 min");
	}

	@Override
	public void couper() {
		System.out.println("decoupe en 4 morceaux");
	}
}
