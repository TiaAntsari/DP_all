package obs;

/**
 * Created by X-MART on 29-Apr-17.
 */
public class Application {
	public static void main(String[] args) {
		ObservableConcret sujet = new ObservableConcret();
		ObserverConcret1 observerConcret1 = new ObserverConcret1();
		sujet.addObserver(observerConcret1);
		ObserverConcret2 observerConcret2 = new ObserverConcret2();
		sujet.addObserver(observerConcret2);
		sujet.setEtat(8);
		sujet.setEtat(7);
		sujet.deleteObserver(observerConcret1);
		sujet.setEtat(9);
	}
}
