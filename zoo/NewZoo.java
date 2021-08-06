package hw.zoo;

import hw.zoo.model.Cages;
import java.util.List;
import java.util.ArrayList;
import hw.zoo.model.Species;
import hw.zoo.model.Animal;
import hw.zoo.model.Cage;

public class NewZoo extends Cages{
    private final static int CageLimit=1;
    List<Animal> result = new ArrayList<Animal>();
    public void checkInAnimal(Animal animal, Cages cages) {
        int numAnimal = getNumber();
        if (numAnimal >= CageLimit){
            System.out.println("Cage is full");
        }
        else{
            this.result.add(animal);
            System.out.println("Animal added in" + cages);
        }

    }
    public void checkOutAnimal(Animal animal, Cages cages) {
        int numAnimal = getNumber();
        if (numAnimal == CageLimit){
            this.result.remove(animal);
            System.out.println("Animal removed from" + cages);
        }
        else{
            System.out.println("Cage is full");
        }
    }


}
