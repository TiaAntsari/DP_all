package ma.ensa;

public class EtatAuGarage implements IEtatAvion {

	// private Avion avion;

	private static EtatAuGarage etatAuGarage_instance;

	public static EtatAuGarage getInstace() {
		if (etatAuGarage_instance == null) {
			etatAuGarage_instance = new EtatAuGarage();
		}
		return etatAuGarage_instance;
	}

	@Override
	public void entrerAuGarage() {
		System.out.println("x x x\tImpossible, avion deja au garage");

	}

	@Override
	public void sortirDuGarage() {
		System.out.println("Garage => Piste");
		// avion.setiEtatAvion(EtatEnPiste.getInstace());
	}

	@Override
	public void decoler() {
		System.out.println("x x x\tImpossible de décoler! (avion au garage)");
	}

	@Override
	public void atterir() {
		System.out.println("x x x\tImpossible d'atterir! (avion au garage)");
	}

	@Override
	public void doAction() {
		System.out.println("-------- Avion au garage");
	}

}
