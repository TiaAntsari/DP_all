package obs;

/**
 * Created by X-MART on 29-Apr-17.
 */
public interface Observable {
    public void addObserver(Observer o);
    public void deleteObserver(Observer o);
    public void notifyObservers();
}
