package ma.ensa.produits;

public abstract class Moto {
	private String model;

	public abstract void affichedetails();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
