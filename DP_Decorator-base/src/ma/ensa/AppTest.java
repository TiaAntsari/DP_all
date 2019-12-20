package ma.ensa;

import ma.ensa.composants.ComposantAbs;
import ma.ensa.composants.ComposantBase1;
import ma.ensa.composants.ComposantBase2;
import ma.ensa.decorators.Decoration1;
import ma.ensa.decorators.Decoration2;

public class AppTest {
	public static void main(String[] args) {
		// ########## Base 1 avec Decoration
		ComposantAbs composantAbs1 = new ComposantBase1();
		// ########## Base 1 avec Decoration 1
		composantAbs1 = new Decoration1(composantAbs1);
		System.out.println(composantAbs1.getDescription());
		System.out.println(composantAbs1.calcul());

		// ########## Base 1 avec Decoration
		composantAbs1 = new Decoration2(composantAbs1);
		System.out.println(composantAbs1.getDescription());
		System.out.println(composantAbs1.calcul());

		// ########## Base 2 avec Decoration
		ComposantAbs composantAbs2 = new ComposantBase2();
		// ########## Base 2 avec Decoration 2
		composantAbs2 = new Decoration2(composantAbs2);
		System.out.println(composantAbs2.getDescription());
		System.out.println(composantAbs2.calcul());

	}

}
