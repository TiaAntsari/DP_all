package ma.ensa;

/**
 * Impl�mentation simple d'un singleton. L'instance est cr��e �
 * l'initialisation.
 */
public class Singleton {

	private int compteur;

	/** Constructeur priv� */
	private Singleton() {
		System.out.println("Instantiantion du singleton");
	}

	/** Instance unique pr�-initialis�e */
	private static Singleton INSTANCE = new Singleton();

	/** Point d'acc�s pour l'instance unique du singleton */
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
