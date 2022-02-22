package com.company;

import people.Heroes;

import java.util.Scanner;

public class StoleJewels {
     public void search(){
         Heroes heroes=new Heroes();
         System.out.println(heroes.getMago());

        int i=0;
        //MapGame mapGame = new MapGame();
        //mapGame.getArrena();
        Scanner scanner1 = new Scanner(System.in);
        //Scanner scanner2 = new Scanner(System.in);
        for (i=0 ;i<5;i++){
            String pos1= String.valueOf(scanner1.nextInt());
            if(pos1.equals("3")){
                i=6;
                System.out.println("you loose "+heroes.getMago());
            }
            else if(pos1.equals("7")){
                System.out.println("you find the treasure "+heroes.getMago());
                i=6;
            }
            else if(pos1.equals("4")){
                System.out.println("you fight coming soon "+heroes.getMago());
                i=6;
            }
            else
                System.out.println("continue");
        }

    }
}
