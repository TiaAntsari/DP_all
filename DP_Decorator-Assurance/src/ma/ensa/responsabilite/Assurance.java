package ma.ensa.responsabilite;

public abstract class Assurance {
	protected String description;

	public abstract double cout();

	public String getDescription() {
		return description;
	}
}
