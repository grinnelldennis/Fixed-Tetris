package com.gamewerks.blocky.util;
import java.util.Random;

public class Shuffle {

    public static int index = 0;
    private static int[] shuffled = {0, 1, 2, 3, 4, 5, 6};

    public static void shuffle(){
        Random rando = new Random();

        for (int i = 6; i >= 0 ; i--) {
            int rand = rando.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[rand];
            shuffled[rand] = temp;
        }
    }

    public static int getNumber(){
        if (index > 6){
            index = 0;
        }
        if (index == 0) {
        	shuffle();
        }
        return shuffled[index++];
    }

    public void printShuffled (){
        for (int x = 0; x < 7; x++){
            System.out.println (shuffled[x]);
        }
    }
}