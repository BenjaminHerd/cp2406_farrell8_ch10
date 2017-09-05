//Class with data fields
public class Candle {

    //variable declaration
    private String name;
    private String colour;
    private int height;
    protected int price;

    //set methods for setting values to variables
    public void setName(String n){
        name = n;
    }

    public void setColour(String c){
        colour = c;
    }

    public void setHeight(int h){
        final int PER_INCH = 2;
        height = h;
        price = height * PER_INCH;
    }

    // get methods for print statements in DemoCandles
    public String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }
    public int getPrice(){
        return price;
    }

    public int getHeight(){
        return height;
    }

}
