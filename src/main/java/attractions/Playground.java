package attractions;

import behaviours.ISecurity;

public class Playground extends Attraction implements ISecurity {

    private int maxAge;

    public Playground(String name, int rating) {
        super(name, rating);
        this.maxAge = 15;
    }

    public int maxAge() {
        return this.maxAge;
    }

    public boolean authorised(persons.Visitor visitor) {
        if (visitor.getAge() <= maxAge()){
            return true;
        } else {
            return false;
        }
    }
}
