package ma.ensa.composants;

public abstract class ComposantAbs {
	protected String description;

	public abstract double calcul();

	public String getDescription() {
		return description;
	}

	// public void setDescription(String description) {
	// this.description = description;
	// }

}
