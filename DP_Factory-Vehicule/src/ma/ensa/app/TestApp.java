package ma.ensa.app;

import ma.ensa.fabriques.FabriqueVehiculeEssence;
import ma.ensa.fabriques.FabriqueVehiculeGasoil;
import ma.ensa.produits.Moto;
import ma.ensa.produits.Voiture;

public class TestApp {
	public static void main(String[] args) {

		// test Vehicule Essence
		Catalogue catalogue1 = new Catalogue(new FabriqueVehiculeEssence());
		Voiture voiture1 = catalogue1.ajouterVoiture();
		Moto moto1 = catalogue1.ajouterMoto();

		moto1.affichedetails();
		voiture1.affichedetails();

		// test Vehicule Gasoil
		Catalogue catalogue2 = new Catalogue(new FabriqueVehiculeGasoil());
		Voiture voiture2 = catalogue2.ajouterVoiture();
		Moto moto2 = catalogue2.ajouterMoto();

		moto2.affichedetails();
		voiture2.affichedetails();

	}

}
