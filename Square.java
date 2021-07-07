package hw.shapes;

public class Square implements Shape {
    double a;
    public Square(double a){
        this.a=a;
    }
    public double getArea(){
        if (a>0)
            return(a*a);
        else
            return (0);
    }
    public void name(){
        System.out.println("Квадрат");
    }
}
