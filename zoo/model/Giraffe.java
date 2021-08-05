package hw.zoo.model;

public class Giraffe implements Animal{
    public String name = "Mel";

    public String getName(){
        return this.name;
    }
    public Species getSpecies(){
        return Species.GIRAFFE;
    }
}
