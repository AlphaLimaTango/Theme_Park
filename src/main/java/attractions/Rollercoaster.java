package attractions;

import behaviours.ISecurity;
import persons.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

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

    @Override
    public boolean authorised(Visitor visitor) {
        if (visitor.getAge() >= getMinAge() && visitor.getHeight() >= getMinHeight() ){
            return true;
        } else {
            return false;
        }
    }
}
