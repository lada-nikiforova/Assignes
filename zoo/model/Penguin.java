package hw.zoo.model;

public class Penguin implements Animal{
    public String name = "Riko";

    public String getName(){
        return this.name;
    }
    public Species getSpecies(){
        return Species.PENGUIN;
    }
}
