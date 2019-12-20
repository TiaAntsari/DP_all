package ma.ensa;

public class EtatEnPiste implements IEtatAvion {

	private static EtatEnPiste _instance;

	public static EtatEnPiste getInstace() {
		if (_instance == null) {
			_instance = new EtatEnPiste();
		}
		return _instance;
	}

	// private Avion avion;

	@Override
	public void entrerAuGarage() {
		System.out.println("Piste => Garage");

	}

	@Override
	public void sortirDuGarage() {
		System.out.println("x x x\tImpossible de Sortir du garage! (avion deja en piste)");

	}

	@Override
	public void decoler() {
		System.out.println("Piste => Vol");
		// avion.setiEtatAvion(EtatEnVol.getInstace());
	}

	@Override
	public void atterir() {
		System.out.println("x x x\tImpossible d'atterir! (avion deja en piste)");

	}

	@Override
	public void doAction() {
		System.out.println("-----------Avion en Piste");

	}

}
