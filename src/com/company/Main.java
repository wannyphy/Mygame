package com.company;

import entity.Entity;
import people.Magicians;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StoleJewels stoleJewel= new StoleJewels();
        stoleJewel.search();
        Entity entityBlue= new Entity(2,3,5);
        Magicians magicians1= new Magicians("brown","168","62","fire",entityBlue,"Cagliostro");
        //System.out.println("hello"+ magicians1.DisplayGamer(magicians1)+entityBlue.attributeEntity(entityBlue));
        //System.out.println("MR"+ magicians1.DisplayGamerName(magicians1));
    }
}
