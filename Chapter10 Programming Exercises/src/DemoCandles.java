public class DemoCandles {

    //setting variables for both candles, with candle2 having one additional variable
    public static void main(String[] args) {

        //new candles to be passed into two different classes
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();

        //set methods to be 'got' later in print statements
        candle1.setName("Lilydale");
        candle1.setColour("Pink");
        candle1.setHeight(5);

        candle2.setName("Bloomingsdale");
        candle2.setColour("White");
        candle2.setHeight(7);
        candle2.setScent("Lilac and Gooseberries");

        //Print statements using getMethods() to retrieve values from passed variables into classes
        System.out.println("This candle is: " + candle1.getName() + " | It's colour is: " + candle1.getColour() +
                " | It's height is: " + candle1.getHeight() + " inches | It's Price is: $" + candle1.getPrice() + ".00");

        System.out.println("The next candle is: " + candle2.getName() + " | It's colour is: " + candle2.getColour() +
        " | It's height is: " + candle2.getHeight() + " inches | It's scent is also: " + candle2.getScent() +
                " | It's price is: $" + candle2.getPrice() + ".00");

    }

}
