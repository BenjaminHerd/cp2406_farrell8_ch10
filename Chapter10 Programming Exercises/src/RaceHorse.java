//'extends' uses the class it extends to as a basis for handling variables already handled by it
// used by line: super(name, colour, birth_year);

public class RaceHorse extends Horse {

    //variable declaration
    protected int races_completed;

    //Class takes in parameters and adds a data field 'races_completed' to variable collection
    public RaceHorse(String name, String colour, int birth_year, int raced){
        super(name, colour, birth_year);
        races_completed = raced;
    }

    // Overloaded method displays depending on how many parameters are passed into it
    public void display(){
        System.out.println("Name: " + name + " | Colour: " + colour + " | Born: " + birth_year + " | Races completed: "
                + races_completed);
    }
}
