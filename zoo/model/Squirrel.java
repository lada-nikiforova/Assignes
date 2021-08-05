package hw.zoo.model;

public class Squirrel implements Animal{
    public String name = "Sandy";

    public String getName(){
        return this.name;
    }
    public Species getSpecies(){
        return Species.SQUIRREL;
    }
}
