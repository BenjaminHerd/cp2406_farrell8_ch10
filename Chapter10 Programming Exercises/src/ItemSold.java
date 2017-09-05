public class ItemSold {

    //variable declaration
    int invoice;
    String description;
    int price;

    //Set methods (use void for these)
    public void setInvoice(int i) {
        invoice = i;
    }

    public void setDescription(String d){
        description = d;
    }

    public void setPrice(int p){
        price = p;
    }

    //Get Methods
    public int getInvoice(){
        return invoice;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }


}
