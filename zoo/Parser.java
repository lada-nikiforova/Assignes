package hw.zoo;


import hw.zoo.model.Animal;

public class Parser extends Logger{
    public void parser(String line){
        if (line == "checkInAnimal"){
            checkInAnimal();
        }
        if (line == "checkOutAnimal"){
            checkOutAnimal();
        }
        else
            System.out.println("Exception");

    }
}
