public class PetSold extends ItemSold {

    //new variable declaration
    Boolean isVaccinated;
    Boolean isNeutered;
    Boolean isHouseBroken;

    //Set methods
    public void setIsVaccinated(Boolean v){
        isVaccinated = v;
    }

    public void setIsNeutered(Boolean n){
        isNeutered = n;
    }

    public void setIsHouseBroken(Boolean hb){
        isHouseBroken = hb;
    }

    //Get methods
    public Boolean getVaccinated() {
        return isVaccinated;
    }
    public Boolean getNeutered() {
        return isNeutered;
    }
    public Boolean getHouseBroken() {
        return isHouseBroken;
    }
}
