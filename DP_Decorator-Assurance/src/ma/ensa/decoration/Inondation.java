package ma.ensa.decoration;

import ma.ensa.responsabilite.Assurance;

public class Inondation extends DecoratorAbs {

	public Inondation(Assurance assurance) {
		super(assurance);
	}

	@Override
	public String getDescription() {

		return assurance.getDescription() + "\nInondation";
	}

	@Override
	public double cout() {

		return 8 + assurance.cout();
	}

}
