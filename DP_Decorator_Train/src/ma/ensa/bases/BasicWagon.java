package ma.ensa.bases;

public class BasicWagon extends Wagon {

	public BasicWagon() {
		this.type = "";
		this.description = "";
		this.connector = "::";
	}

	@Override
	public String print() {
		return this.getDescription();
	}

}
