package hw.shapes;

public class Triangle implements Shape{
    double a,h;
    public Triangle(double a, double h){
        this.a=a;
        this.h=h;
    }
    public double getArea(){
        if ((a>0) && (h>0))
            return(0.5*a*h);
        else
            return(0);
    }
    public void name(){
        System.out.println("Треугольник");
    }
}
