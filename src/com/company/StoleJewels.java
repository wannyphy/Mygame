package com.company;

import entity.MapGame;

import java.util.Scanner;

public class StoleJewels {
     public void search(){
        int i=0;
        //MapGame mapGame = new MapGame();
        //mapGame.getArrena();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        for (i=0 ;i<5;i++){
            String pos1= String.valueOf(scanner1.nextInt());
            if(pos1.equals("3")){
                i=6;
                System.out.println("you loose");
            }
            if(pos1.equals("7")){
                System.out.println("you find the treasure");
            }
            else
            System.out.println("continue");
        }

    }
}
