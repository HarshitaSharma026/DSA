package JavaConcepts.Inheritance;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
//        human.age()
        // child class can't access parent class private members why?
        // 1. First of all private members have their scope upto that file only,
        // suppose even if you create a child class in that file itself, then also you can't access it.

        // can parent class access child class memebers?
        Species species = new Species();
//        species.legs;
        // no it can't

        Species species1 = new Human();
//        species1.legs
//        species1.age
        // then also we can't access child class members why?

//        Human human1 = new Species();
//        human1
    }
}
