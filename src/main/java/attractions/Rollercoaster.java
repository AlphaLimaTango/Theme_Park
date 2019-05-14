package attractions;

public class Rollercoaster extends Attraction {

    private int minAge;
    private int minHeight;

    public Rollercoaster(String name, int rating) {
        super(name, rating);
        this.minAge = 12;
        this.minHeight = 145;
    }

    public int getMinAge() {
        return this.minAge;
    }


    public int getMinHeight() {
        return this.minHeight;
    }
}
