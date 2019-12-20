package ma.ensa.fabriques;

import ma.ensa.produits.Moto;
import ma.ensa.produits.MotoGasoil;
import ma.ensa.produits.Voiture;
import ma.ensa.produits.VoitureGasoil;

public class FabriqueVehiculeGasoil extends FabriqueVehiculeAbstraite {

	@Override
	public Moto createMoto() {
		Moto moto = new MotoGasoil();
		return moto;
	}

	@Override
	public Voiture createVoiture() {
		Voiture voiture = new VoitureGasoil();
		return voiture;
	}
}
