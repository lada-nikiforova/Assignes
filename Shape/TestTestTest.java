package hw.shapes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.css.Counter;

import static org.junit.jupiter.api.Assertions.*;
@Test
public class TestTestTest {
    int currentResult;

    public void ShapeTest1() {
        Shape shape1 = new Circle(5);
        double Result = shape1.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }
    public void ShapeTest2(){

        Shape shape2 = new Circle(-5);
        double Result = shape2.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest3(){

        Shape shape3 = new Triangle(-4,6);;
        double Result = shape3.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest4(){

        Shape shape4 = new Triangle(4,-6);;
        double Result = shape4.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }
    public void ShapeTest5(){

        Shape shape5 = new Triangle(4,6);;
        double Result = shape5.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest6(){
        int currentResult;
        Shape shape6 = new Triangle(-4,-6);;
        double Result = shape6.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest7(){

        Shape shape7 = new Square(-10);;
        double Result = shape7.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest8() {

        Shape shape8 = new Square(10);
        ;
        double Result = shape8.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest9() {

        Shape shape9 = new Ellipse(-7, 10);
        double Result = shape9.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest10() {

        Shape shape10 = new Ellipse(7, -10);
        double Result = shape10.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest11() {

        Shape shape11 = new Ellipse(-7, -10);
        double Result = shape11.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    public void ShapeTest12() {

        Shape shape12 = new Ellipse(7, 10);
        double Result = shape12.getArea();
        if (Result > 0)
            currentResult = 1;
        else
            currentResult = 0;

        Assert.assertEquals(1, currentResult);
    }

    

}