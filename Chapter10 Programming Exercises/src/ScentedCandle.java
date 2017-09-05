//'Extends' uses code from extended class as 'super' to handle variables
public class ScentedCandle extends Candle {

    //variable declaration
    private String scent;

    //Set additional parameter
    public void setScent(String scent){
        this.scent = scent;
    }
    //get additional parameter
    public String getScent(){
        return scent;
    }

    //override method called if ScentedCandle Class is used
    //i.e. if a candle has a scent
    @Override
    public void setHeight(int h){
        final int PER_INCH = 3;

        //super line used to get height from parent class (inheritance)
        super.setHeight(h);
        price = h * PER_INCH;
    }

}
