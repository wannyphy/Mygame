package entity;

import entity.Entity;

public class FirstRole {
    String name;
    String hair;
    String height;
    String weight;
    String power;
    Entity entity;

    public FirstRole(String hair, String height, String weight, String power, Entity entity,String name) {
        this.hair = hair;
        this.height = height;
        this.weight = weight;
        this.power = power;
        this.entity = entity;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public String getHair() {
        return hair;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getPower() {
        return power;
    }

    public Entity getEntity() {
        return entity;
    }
}
