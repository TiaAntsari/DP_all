package ma.ensa.decorator;

import ma.ensa.bases.Wagon;

public class HeadLast extends TrainDecorator {

	public HeadLast(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return wagon.print() + "HHHH>";
	}

	@Override
	public String getType() {
		return wagon.getType() + "lh";
	}

	@Override
	public String getConnector() {
		return wagon.getConnector();
	}
}
