package hw.zoo.model;
import java.util.List;

public class CageGiraffe implements Cage {
    int number;
    double area;
    protected Condition condition;
    protected Animal animal;

    public void cage(int number, double area){
        this.number = number;
        this.area = area;
        this.condition = () -> List.of(Species.GIRAFFE);

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
        return "CageGiraffe{" +
                "number=" + number +
                ", area='" + area + '\'' +
                ", condition='" + condition + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }


}
