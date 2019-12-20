package ma.ensa.decoration;

import ma.ensa.responsabilite.Assurance;

public class BriseGlace extends DecoratorAbs {

	public BriseGlace(Assurance assurance) {
		super(assurance);
	}

	@Override
	public double cout() {

		return 10 + assurance.cout();
	}

	@Override
	public String getDescription() {

		return assurance.getDescription() + "\nBriseGlace";
	}

}
