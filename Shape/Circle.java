package hw.shapes;

public class Circle implements Shape{
    double r;
    public Circle(double r){
        this.r=r;
    }
    public double getArea(){
        if (r>0)
            return(r*r*Math.PI);
        else
            return (0);

    }
    public void name(){
        System.out.println("Круг");
    }
}
