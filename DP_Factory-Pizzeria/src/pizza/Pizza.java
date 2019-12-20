package pizza;

public abstract class Pizza {
    String description;
    public abstract void cuire();
    public abstract void embaler();
    public abstract void preparer();
    public abstract void couper();

    public String getDescription() {
        return description;
    }
}
