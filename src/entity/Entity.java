package entity;
public class Entity {
    int jewels;
    int powerfull;
    int life;

    public Entity(int jewels, int powerfull, int life) {
        this.jewels = jewels;
        this.powerfull = powerfull;
        this.life = life;
    }

    public int getJewels() {
        return jewels;
    }

    public int getPowerfull() {
        return powerfull;
    }

    public int getLife() {
        return life;
    }

    public String attributeEntity(Entity entity){
       entity=new Entity(entity.getJewels(),entity.getPowerfull(),entity.getLife());
       String display="you have: "+entity.getJewels()+" jewels, "+"you have: "+entity.getPowerfull()+" power, "+"you have: "+entity.getLife()+" life";
        return display;
    }
}
