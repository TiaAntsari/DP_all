package ma.ensa.decorators;

import ma.ensa.composants.ComposantAbs;

public class Decoration2 extends DecoratorAbs {

	public Decoration2(ComposantAbs composantAbs) {
		super(composantAbs);
	}

	@Override
	public String getDescription() {
		return composantAbs.getDescription() + " + Decoration 2";
	}

	@Override
	public double calcul() {
		return composantAbs.calcul() + 22;
	}

}
