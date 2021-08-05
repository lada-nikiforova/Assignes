package hw.zoo.model;


/**
 * class provide information about Cage
 * Assumptions:
 * one Cage - one Animal
 * @getNumber() used as return primary key
 */
public interface Cage{
    //primary key
    int getNumber();
    double getArea();
    Condition getCondition();
    boolean isVacantCage();
}