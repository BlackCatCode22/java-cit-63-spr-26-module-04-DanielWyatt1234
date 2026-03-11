package danielWyatt.myZoo.com;

public class Bear extends Animal {
    // Unique feature
    private boolean isHibernating;

    public Bear(String name, int anAge) {
        //Call the parent constructor
        super(name, anAge, "Bear");
        this.isHibernating = false;
    }
    public boolean isHibernating() { return isHibernating; }
}
