package ma.ensa;

public class Avion {

	private IEtatAvion iEtatAvion;

	public void setiEtatAvion(IEtatAvion iEtatAvion) {
		this.iEtatAvion = iEtatAvion;
	}

	public Avion() {
		this.iEtatAvion = EtatAuGarage.getInstace();
	}

	public void entrerAuGarage() {
		iEtatAvion.entrerAuGarage();
		if (iEtatAvion instanceof EtatEnPiste) {
			setiEtatAvion(EtatAuGarage.getInstace());
		}
	}

	public void sortirDuGarage() {

		iEtatAvion.sortirDuGarage();
		if (iEtatAvion instanceof EtatAuGarage) {
			setiEtatAvion(EtatEnPiste.getInstace());
		}

	}

	public void decoler() {
		iEtatAvion.decoler();
		if (iEtatAvion instanceof EtatEnPiste) {
			setiEtatAvion(EtatEnVol.getInstace());
		}
		// iEtatAvion.decoler();
	}

	public void atterir() {
		// iEtatAvion = new EtatEnPiste();
		// setiEtatAvion(EtatEnPiste.getInstace());
		iEtatAvion.atterir();
		if (iEtatAvion instanceof EtatEnVol) {
			setiEtatAvion(EtatEnPiste.getInstace());
		}
	}

	public void doAction() {
		iEtatAvion.doAction();
	}

}
