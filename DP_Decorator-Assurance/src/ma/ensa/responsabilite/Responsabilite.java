package ma.ensa.responsabilite;

public class Responsabilite extends Assurance {

	public Responsabilite() {
		this.description = "assur�";
	}

	@Override
	public double cout() {
		return 7;
	}

}
