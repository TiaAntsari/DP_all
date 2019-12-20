package ma.ensa.app;

import ma.ensa.decoration.BriseGlace;
import ma.ensa.decoration.DecoratorAbs;
import ma.ensa.decoration.DommageCollision;
import ma.ensa.responsabilite.Assurance;
import ma.ensa.responsabilite.Responsabilite;

public class Test {

	public static void main(String[] args) {
		Assurance assurance = new Responsabilite();
		System.out.println(assurance.getDescription());
		System.out.println(assurance.cout());

		System.out.println("*************************");
		assurance = new BriseGlace(assurance);
		System.out.println(assurance.getDescription());
		System.out.println(assurance.cout());

		System.out.println("*************************");
		assurance = new DommageCollision(assurance);
		System.out.println(assurance.getDescription());
		System.out.println(assurance.cout());

		System.out.println("*************************");
		// assurance = new DommageCollision(assurance);
		System.out.println(assurance.getDescription());
		System.out.println(assurance.cout());

		System.out.println(((DecoratorAbs) assurance).getAssurance());

	}

}
