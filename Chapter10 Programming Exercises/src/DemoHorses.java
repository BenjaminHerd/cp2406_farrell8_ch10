/*
Create a class called Horse which: Contains data of name, colour, birth year.
Include get and set methods

RaceHorse contains additional field for number of races

Use DemoHorses as demo to show application getting objects from each class
 */

public class DemoHorses {
    public static void main(String[] args) {

        //Assign a new variable to show how grabbing objects from a class can work
        Horse horse1 = new Horse();

        RaceHorse horse2 = new RaceHorse();

        //Set methods for each horse
        horse1.setName("Clydesdale");
        horse1.setColour("Brown");
        horse1.setBirthYear(1997);

        horse2.setName("Phar Lap");
        horse2.setColour("Brown");
        horse2.setBirthYear(1926);
        horse2.setRaces(51);


        //print statements for each horse
        System.out.println(horse1.getName() + " is " +
                horse1.getColour() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " is " +
                horse2.getColour() + " and was born in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
    }
}

