package danielWyatt.myZoo.com;

public class Hyena extends Animal{
    // Unique feature
    private String laugh;

    public Hyena(String name, int anAge) {
        // Call the parent constructor
        super(name, anAge, "Hyena");
        this.laugh = "High";
    }
    public String getLaugh() { return laugh; }
}
