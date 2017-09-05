/*
Create a class called Horse which: Contains data of name, colour, birth year.
Include get and set methods

RaceHorse contains additional field for number of races

Use DemoHorses as demo to show application getting objects from each class
 */

public class DemoHorses {
    public static void main(String[] args) {

        //Assign a new variable to show how grabbing objects from a class can work
        Horse horse1 = new Horse("Clydesdale", "Brown with White Socks", 1997);

        RaceHorse horse2 = new RaceHorse("Phar Lap (Thoroughbred)", "Brown", 1926, 51);

        //display() methods run dependent on how many parameters are passed into them
        horse1.display();
        horse2.display();
    }
}
