package ma.ensa.decoration;

import ma.ensa.responsabilite.Assurance;

public abstract class DecoratorAbs extends Assurance {
	protected Assurance assurance;

	public DecoratorAbs(Assurance assurance) {
		super();
		this.assurance = assurance;
	}

	public abstract String getDescription();

	public Assurance getAssurance() {
		return assurance;
	}

	// public abstract double cout();

}
