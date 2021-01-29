
package dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

   
    public static void main(String[] args) {
        
        int dice1;
        int dice2;
        int total;
        int i;
        int money;
        int games = 0;
        Random randy = new Random();
        Scanner prob = new Scanner(System.in);
        
        System.out.println ("How much money can do you have to play today?");
        money = prob.nextInt();
        if (money > 100) {
            System.out.println ("Come on really? Try again please");
        }
        else{
        i = money;
        
        while (i != 0) {
            
            dice1 = randy.nextInt(6);
            dice2 = randy.nextInt(6);
            total = dice1+dice2;
            System.out.println ("You rolled: " +total);
            
            if (total == 7) {
                i = i + 5 - 1;
                System.out.println ("You Won! Congrats you get five more dollars!");
            }
            else {
                i = i - 1;
                //System.out.println ("You have lost try again");
            }
          games = games + 1;
        }
        
        
        System.out.println ("Your luck has run out and you have run out of Money, thanks for playing!");
        System.out.println ("It was estimated that you would play: " +money + " games based upon how much money you started with.");
        System.out.println ("Instead you played: " + games +" games.");
        }      
    }
    
}
