package ma.ensa.decoration;

import ma.ensa.responsabilite.Assurance;

public class Incendie extends DecoratorAbs {

	public Incendie(Assurance assurance) {
		super(assurance);
	}

	@Override
	public String getDescription() {

		return assurance.getDescription() + "\nIncendie";
	}

	@Override
	public double cout() {

		return 13 + assurance.cout();
	}

}
