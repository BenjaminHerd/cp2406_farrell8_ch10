public class PremiumSugarSmashPlayer extends SugarSmashPlayer {

    //variable declaration
    int LEVELS = 50;
    int MIN_SCORE = 100;

    //Class method for handling premium players
    public PremiumSugarSmashPlayer(){
        scores = new int[LEVELS];
    }

    //Override here changes the LEVELS constant to 50 and returns to
    //DemoSugarRush instead of 10 for a standard player
    @Override
    public int getLevels(){
        return LEVELS;
    }
}
