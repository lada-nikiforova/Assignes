package hw.zoo.model;
import java.util.List;
import hw.zoo.model.Species;

public class Cages implements Cage{
    int number;
    double area;
    protected Condition condition;
    protected Animal animal;


    public void cage(int number, double area, Species species){
        this.number = number;
        this.area = area;
        //this.condition = () -> species;

    }
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public double getArea() {
        return area;
    }
    @Override
    public Condition getCondition(){
        return condition;
    }
    @Override
    public boolean isVacantCage(){
        return animal == null;
    }
    @Override
    public String toString() {
        return "Cage{" +
                "number=" + number +
                ", area='" + area + '\'' +
                ", condition='" + condition + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}

