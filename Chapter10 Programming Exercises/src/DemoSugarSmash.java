//import statement for java utility
import java.util.*;

public class DemoSugarSmash {

    //Main function that runs the program
    public static void main(String[] args) {
        SugarSmashPlayer ssPlayer = new SugarSmashPlayer();

        //Set items for standard player
        ssPlayer.setPlayerID(1001);
        ssPlayer.setPlayerName("Ben");

        display(ssPlayer);
        System.out.println("***************");

        ssPlayer.setScores(120, 0);
        ssPlayer.setScores(140, 1);

        display(ssPlayer);
        System.out.println("***************");

        ssPlayer.setScores(10, 2);

        display(ssPlayer);
        System.out.println("***************");

    }

    //Display method for showing variables as they are set and received
    public static void display(SugarSmashPlayer p){
        System.out.println("   ID#" + p.getPlayerID() + " Name: " + p.getPlayerName());

        for (int x = 0; x < p.getLevels(); ++x){
            System.out.println("   " + p.getScores(x));
        }
        System.out.println();

    }

}
