package stalls;

import behaviours.ISecurity;
import persons.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private int minAge;

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.minAge = 18;
    }

    public int getMinAge() {
        return minAge;
    }

    @Override
    public boolean authorised(Visitor visitor) {
        if (visitor.getAge() >= this.minAge){
            return true;
        } else {
            return false;
        }
    }
}
