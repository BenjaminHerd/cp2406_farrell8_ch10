public class DemoPoems {

    //start with main function call to compile
    public static void main(String[] args) {

        //New variables
        Poem poem = new Poem("Waltzing Matilda", 32);
        Couplet couplet = new Couplet("Canterbury Tales");
        Limerick limerick = new Limerick("Hickory Dickery Dock");
        Haiku haiku = new Haiku("In the twilight rain");

        //display method calls
        display(poem);
        display(couplet);
        display(limerick);
        display(haiku);


    }
    //Display method, with 'p' acting as the variable accepting parameters dependent on class called
    public static void display(Poem p){
        System.out.println("This poem is called: '" + p.getTitle() + "' and has " + p.getLINES() + " lines.");
        System.out.println("****************************");

    }
}
