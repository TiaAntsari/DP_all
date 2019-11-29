package ma.ensa;

/**
 * Implémentation simple d'un singleton. L'instance est créée à
 * l'initialisation.
 */
public class Singleton {

	private int compteur;

	/** Constructeur privé */
	private Singleton() {
		System.out.println("Instantiantion du singleton");
	}

	/** Instance unique pré-initialisée */
	private static Singleton INSTANCE = new Singleton();

	/** Point d'accès pour l'instance unique du singleton */
	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void traiter(String taskName) {
		System.out.println("############ Debut " + taskName);

		for (int i = 0; i < 3; i++) {
			synchronized (this) {
				++compteur;
			}

			System.out.println(".." + compteur);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("########## Fin " + taskName + " && compteur = " + compteur);
	}

}
