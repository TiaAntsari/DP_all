package ma.ensa.fabriques;

import ma.ensa.produits.Moto;
import ma.ensa.produits.MotoEssence;
import ma.ensa.produits.Voiture;
import ma.ensa.produits.VoitureEssence;

public class FabriqueVehiculeEssence extends FabriqueVehiculeAbstraite {

	@Override
	public Moto createMoto() {
		Moto moto = new MotoEssence();
		return moto;
	}

	@Override
	public Voiture createVoiture() {
		Voiture voiture = new VoitureEssence();
		return voiture;
	}

}
