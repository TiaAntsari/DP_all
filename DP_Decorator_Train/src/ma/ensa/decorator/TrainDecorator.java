package ma.ensa.decorator;

import ma.ensa.bases.Wagon;

public abstract class TrainDecorator extends Wagon {

	protected Wagon wagon;

	public TrainDecorator(Wagon wagon) {
		this.wagon = wagon;
	}

	public abstract String getConnector();

	public abstract String getType();

	public Wagon getWagon() {
		return wagon;
	}

}
