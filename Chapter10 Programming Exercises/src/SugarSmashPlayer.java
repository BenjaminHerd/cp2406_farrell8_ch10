public class SugarSmashPlayer {

    //variable declaration
    int[] scores;
    int playerID;
    String playerName;

    //Constants
    int LEVELS = 10;
    int MIN_SCORE = 100;


    public SugarSmashPlayer() {

        scores = new int[LEVELS];
    }
        //Set Methods (void doesn't return variables)
    public void setPlayerID(int id){
        playerID = id;
    }

    public void setPlayerName(String name){
        playerName = name;
    }

    public void setScores(int score, int level){
        int x;
        boolean isBadLevel = false;

        //If the level number is less than 0 or (||) the level is greater than 10
        if(level < 0 || level > scores.length - 1)
            System.out.println("******" + level + " is an invalid level.");

        //Otherwise, do this
        else{
            //For loop for the number of levels in the game
            for(x = 0; x < level; ++x)

                //if the score in the array is less than the MIN_SCORE, then it's a bad level
                if (scores[x] < MIN_SCORE){
                    isBadLevel = true;
                }
                //If it is a bad level, then print error
                if (isBadLevel){
                    System.out.println("****** A score can not be set for level: " + level);
                }

                else
                    scores[level] = score;

        }

    }

        //Get Methods
        public int getPlayerID() {
            return playerID;
        }

        public String getPlayerName() {
            return playerName;
        }

    public int getScores(int level) {
        int score = -99;
        //If the level number is less than 0 or (||) the level is greater than 10
        if (level < 0 || level > scores.length - 1)
            System.out.println("******" + level + " is an invalid level.");

            //Otherwise, do this
        else
            score = scores[level];

            return score;

    }

    public int getMinScore(){
        return MIN_SCORE;
    }

    public int getLevels() {
        return LEVELS;
    }
}

