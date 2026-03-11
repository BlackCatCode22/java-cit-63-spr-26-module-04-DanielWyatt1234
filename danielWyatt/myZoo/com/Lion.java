package danielWyatt.myZoo.com;

public class Lion extends Animal {
    // Unique feature
    private String maneSize;

    public Lion(String name, int anAge) {
        // Call the parent constructor
        super(name, anAge, "Lion");
        this.maneSize = "Large";
    }
    public String getManeSize() { return maneSize; }
}
