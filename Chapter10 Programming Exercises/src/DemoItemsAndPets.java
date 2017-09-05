public class DemoItemsAndPets {

    //Main method call to start the application, otherwise it wouldn't run/compile
    public static void main(String[] args) {

        //Items to be handled by two different classes
        ItemSold item = new ItemSold();
        PetSold pet = new PetSold();

        //This one tests both
        PetSold pet2 = new PetSold();

        //Set method calls with entry parameter
        item.setInvoice(1234);
        item.setDescription("Aquarium");
        item.setPrice(30);

        pet.setIsVaccinated(true);
        pet.setIsNeutered(true);
        pet.setIsHouseBroken(false);

        //For testing an object being sent to both classes
        pet2.setInvoice(2222);
        pet2.setDescription("Border Collie");
        pet2.setPrice(97);

        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(true);
        pet2.setIsHouseBroken(true);

        //Method calls for displaying different sets of data
        display(item);
        System.out.println("*****************************");
        displayPetData(pet);
        System.out.println("*****************************");
        //Same object, two method calls
        display(pet2);
        displayPetData(pet2);
    }
        //Display methods for each type of 'thing passed into the classes

    public static void display(ItemSold item){
        System.out.println("Invoice No. " + item.getInvoice() + " | Description: " + item.getDescription() + " | " +
                "Price is: $" + item.getPrice() + ".00");
        }

        //'item' here is still used since PetSold is a subclass from ItemSold
    public static void displayPetData(PetSold item){
        System.out.println("Vaccinated? " + item.getVaccinated() + " | Neutered? " + item.getNeutered() +
        " | House Broken? " + item.getHouseBroken());
    }

    }


//Get Method calls in print statements
//        System.out.println("Invoice No. " + item.getInvoice() + " | The description includes: " + item.getDescription()
//         + " | The Price is: $" + item.getPrice() + ".00");
//
//        System.out.println("Is the pet vaccinated? " + pet.getVaccinated() + " | Neutered? " + pet.getNeutered() + " | " +
//                "House Broken? " + pet.getHouseBroken());