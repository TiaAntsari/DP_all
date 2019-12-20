package obs;

/**
 * Created by X-MART on 29-Apr-17.
 */
public class ObserverConcret2 implements Observer {
    @Override
    public void update(int v) {
        System.out.println("Observateur2");
        System.out.println("Resultat : "+v*6);
    }
}
