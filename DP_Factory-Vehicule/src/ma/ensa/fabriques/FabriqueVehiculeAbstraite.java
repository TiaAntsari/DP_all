package ma.ensa.fabriques;

import ma.ensa.produits.Moto;
import ma.ensa.produits.Voiture;

public abstract class FabriqueVehiculeAbstraite {

	public abstract Moto createMoto();

	public abstract Voiture createVoiture();

}
