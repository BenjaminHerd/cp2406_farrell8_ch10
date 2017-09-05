//'extends' uses the class it extends to as a basis for handling variables already handled by it
// used by line: super(name, colour, birth_year);

public class RaceHorse extends Horse {

    //variable declaration
    private int races;

    //Method call for getting races number
    public int getRaces()
    {
        return races;
    }

    //Set races method for getting variable value
    public void setRaces(int r)
    {
        races = r;
    }
}
