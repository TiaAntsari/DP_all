package ma.ensa.decorators;

import ma.ensa.composants.ComposantAbs;

public class Decoration1 extends DecoratorAbs {

	public Decoration1(ComposantAbs composantAbs) {
		super(composantAbs);
	}

	@Override
	public String getDescription() {
		return composantAbs.getDescription() + " + Decoration 1";
	}

	@Override
	public double calcul() {
		return composantAbs.calcul() + 11;
	}

}
