//Class with data fields

public class Horse {

    //variable declaration
    public String name;
    public String colour;
    public int birth_year;

    //Setting variables inside the class to be used in later methods
    public Horse(String name, String colour, int birth_year){
        this.name = name;
        this.colour = colour;
        this.birth_year = birth_year;
    }

    //Shows results of information 'got' from this class
    public void display(){
        System.out.println("This horse is: " + name + " | With the colour of: " + colour + " | Born in: " + birth_year);
    }
}
