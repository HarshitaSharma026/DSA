package JavaConcepts.Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Shapes shapes = new Shapes();

//        shapes.area();
//        // here if area() method exists in circle class then preference will be given to that method
//        // if it doesn't exists in circle class then it'll go to super class area() method
//        circle.area();
//        square.area();

        Shapes s1 = new Square();
        Shapes s2 = new Circle();
//        s1.area();
//        s2.area();
        // in the above case they are calling their respective object class method why?
        // its so because in case of overriding, which method to call will depend on the type of object that is passed to the reference variable.
        // that's why here, even though the reference variable is of type shapes, the object that is passed to this reference vairbale is of type child class
        // so its is calling child class methods
        // this method is known as UPCASTING
        // and this whole process is how OVERRIDING works

        Circle circle1 = new Circle();
        Circle.area();

        ArrayList list = new ArrayList();
        list.add(1);
        list.add("hello");
        System.out.println(list);
    }

}
