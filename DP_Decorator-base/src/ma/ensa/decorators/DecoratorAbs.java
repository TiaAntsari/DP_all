package ma.ensa.decorators;

import ma.ensa.composants.ComposantAbs;

public abstract class DecoratorAbs extends ComposantAbs {
	protected ComposantAbs composantAbs;

	public DecoratorAbs(ComposantAbs composantAbs) {
		this.composantAbs = composantAbs;

	}

	public ComposantAbs getComposantAbs() {
		return composantAbs;
	}

	public abstract String getDescription();

}
