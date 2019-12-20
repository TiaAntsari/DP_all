package ma.ensa.bases;

public abstract class Wagon {
	protected String type;
	protected String description;
	protected String connector;

	public abstract String print();

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public String getConnector() {
		return connector;
	}

}
