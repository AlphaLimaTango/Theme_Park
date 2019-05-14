package stalls;

public class TobaccoStall extends Stall{

    private int minAge;

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.minAge = 18;
    }

    public int getMinAge() {
        return minAge;
    }
}
