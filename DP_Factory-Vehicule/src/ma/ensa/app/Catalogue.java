package ma.ensa.app;

import ma.ensa.fabriques.FabriqueVehiculeAbstraite;
import ma.ensa.produits.Moto;
import ma.ensa.produits.Voiture;

public class Catalogue {

	// private Set<Moto> motos;
	// private Set<Voiture> voiture;

	private FabriqueVehiculeAbstraite fabriqueVehiculeAbstraite;

	public Catalogue(FabriqueVehiculeAbstraite fabriqueVehiculeAbstraite) {
		super();
		this.fabriqueVehiculeAbstraite = fabriqueVehiculeAbstraite;
	}

	public Moto ajouterMoto() {
		return fabriqueVehiculeAbstraite.createMoto();
	}

	public Voiture ajouterVoiture() {
		return fabriqueVehiculeAbstraite.createVoiture();
	}

}
