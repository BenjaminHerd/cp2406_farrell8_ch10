public class Poem {

    //variable declaration
    String title;

        //Constant for number of lines
    int LINES = 0;

    //Method for constructing a poem
    public Poem(String name, int numLines){
        title = name;
        LINES = numLines;
    }
    //get methods
    public String getTitle(){
        return title;
    }
    public int getLINES(){
        return LINES;
    }

}
