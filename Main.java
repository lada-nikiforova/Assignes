package hw.shapes;

public class Main {
    public static void main (String[] args){
        Shape shape1 = new Circle(5);
        shape1.name();
        System.out.println(shape1.getArea());
        Shape shape2 = new Triangle(4,6);
        shape2.name();
        System.out.println(shape2.getArea());
        Shape shape3 = new Square(10);
        shape3.name();
        System.out.println(shape3.getArea());
        Shape shape4 = new Ellipse(7,10);
        shape4.name();
        System.out.println(shape4.getArea());

        System.out.println("Результаты тестов:");
        Shape shape5 = new Circle(-5);
        shape5.name();
        System.out.println(shape5.getArea());
        Shape shape6 = new Triangle(-4,6);
        Shape shape7 = new Triangle(4,-6);
        Shape shape8 = new Triangle(-4,-6);
        shape6.name();
        System.out.println(shape6.getArea());
        System.out.println(shape7.getArea());
        System.out.println(shape8.getArea());
        Shape shape9 = new Square(-10);
        shape9.name();
        System.out.println(shape9.getArea());
        Shape shape10 = new Ellipse(-7,10);
        Shape shape11 = new Ellipse(7,-10);
        Shape shape12 = new Ellipse(-7,-10);
        shape4.name();
        System.out.println(shape10.getArea());
        System.out.println(shape11.getArea());
        System.out.println(shape12.getArea());









    }

}
