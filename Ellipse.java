package hw.shapes;

public class Ellipse implements Shape{
    double a,b;
    public Ellipse(double a, double b){
        this.a=a;
        this.b=b;
    }
    public double getArea(){
        if ((a>0) && (b>0))
            return(a*b*Math.PI);
        else
            return(0);
    }
    public void name() {
        System.out.println("Эллипс");
    }
}
