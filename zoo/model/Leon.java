package hw.zoo.model;

public class Leon implements Animal{
    public String name = "Leo";

    public String getName(){
        return this.name;
    }
    public Species getSpecies(){
        return Species.LEON;
    }

}
