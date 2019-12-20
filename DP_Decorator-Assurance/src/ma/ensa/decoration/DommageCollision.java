package ma.ensa.decoration;

import ma.ensa.responsabilite.Assurance;

public class DommageCollision extends DecoratorAbs {

	public DommageCollision(Assurance assurance) {
		super(assurance);
	}

	@Override
	public String getDescription() {

		return assurance.getDescription() + "\nDommage et collision";
	}

	@Override
	public double cout() {

		return 15 + assurance.cout();
	}

}
