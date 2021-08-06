package hw.zoo;
import hw.zoo.InhibitionLog;
import hw.zoo.model.Animal;
import hw.zoo.model.Species;

import java.util.List;
import java.util.Date;

public class Logger {
    private Species animalSpecies;
    private String animalName;
    public void checkInAnimal(){
        this.animalSpecies = animalSpecies;
        this.animalName = animalName;
    }
    public void checkOutAnimal(){

        this.animalSpecies = animalSpecies;
    }

}
