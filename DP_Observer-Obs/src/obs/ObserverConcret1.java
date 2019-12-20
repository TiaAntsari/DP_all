package obs;

/**
 * Created by X-MART on 29-Apr-17.
 */
public class ObserverConcret1 implements Observer {
    @Override
    public void update(int v) {
        System.out.println("Observateur1");
        System.out.println("Resultat : "+v*3);
    }
}
