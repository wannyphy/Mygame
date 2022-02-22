package people;

import entity.Entity;
import people.Magicians;

public class Heroes {
    public String getMago() {
        Entity entityBlue = new Entity(2, 3, 5);
        Magicians magicians1 = new Magicians("brown", "168", "62", "fire", entityBlue, "Cagliostro");
        return magicians1.getName();
    }
}