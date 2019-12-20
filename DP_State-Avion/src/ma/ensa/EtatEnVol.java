package ma.ensa;

public class EtatEnVol implements IEtatAvion {

	private static EtatEnVol _instance;

	public static EtatEnVol getInstace() {
		if (_instance == null) {
			_instance = new EtatEnVol();
		}
		return _instance;
	}

	// private Avion avion;

	@Override
	public void entrerAuGarage() {
		System.out.println("x x x\tImpossible de se mettre au garage! (avion en plein vol)");

	}

	@Override
	public void sortirDuGarage() {
		System.out.println("x x x\tImpossible de sortir du garage! (avion en plein vol)");

	}

	@Override
	public void decoler() {
		System.out.println("x x x\tImpossible de décoler! (avion deja en vol)");

	}

	@Override
	public void atterir() {
		System.out.println("Vol => Piste");
		// avion.setiEtatAvion(EtatEnPiste.getInstace());

	}

	@Override
	public void doAction() {
		System.out.println("------------Avion en plein vol");

	}

}
