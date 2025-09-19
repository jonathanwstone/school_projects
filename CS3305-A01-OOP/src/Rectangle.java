// Name: Jonathan Stone
// Class: CS 3305/Section# 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

public class Rectangle {

    // Variables
    private double width;
    private double height;

    // Regular Rectangle constructor
    Rectangle(){
        this.width = 1.00;
        this.height = 1.00;
    }

    // Rectangle constructor
    Rectangle(double width, double height){
        // Rectangle Variables
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return (getWidth() * getHeight());
    }
    public double getPerimeter(){
        return (2*(getWidth() + getHeight()));
    }
    public String printRectangle(String objectName){
        return "Rectangle " + objectName + " is " + getWidth() + " units wide and " + getHeight() + " units high.";
    }

}
