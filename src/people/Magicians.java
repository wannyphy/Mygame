package people;

import entity.Entity;
import entity.FirstRole;

/** define the role of the magician with his attribute
 * I can later make a generic class that allows the player
 * to choose his attributes*/

public class Magicians extends FirstRole {
    public Magicians(String hair, String height, String weight, String power, Entity entity, String name) {
        super(hair, height, weight, power, entity, name);

    }

    Entity entity = null;

    public String DisplayGamer(Magicians magicians){
        magicians = new Magicians(magicians.getHair(),magicians.getHeight(),magicians.getWeight(),magicians.getPower(),magicians.getEntity(),magicians.getName());
        String display= " you have "+ magicians.getHair()+" hair, "+"your height is "+magicians.getHeight()+" cm,"+"your weight is "+magicians.getWeight()+" kg, "+"your power is "+magicians.getPower()+" ,your name is "+magicians.getName();
        return display ;
    }
    public String DisplayGamerName(Magicians magicians){
        magicians = new Magicians(magicians.getHair(),magicians.getHeight(),magicians.getWeight(),magicians.getPower(),magicians.getEntity(),magicians.getName());
        String display= magicians.getName();
        return display ;
    }


}
