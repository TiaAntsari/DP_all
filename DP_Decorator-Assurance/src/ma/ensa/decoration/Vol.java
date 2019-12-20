package ma.ensa.decoration;

import ma.ensa.responsabilite.Assurance;

public class Vol extends DecoratorAbs {

	public Vol(Assurance assurance) {
		super(assurance);
	}

	@Override
	public String getDescription() {

		return assurance.getDescription() + "Vol";
	}

	@Override
	public double cout() {

		return 19 + assurance.cout();
	}

}
