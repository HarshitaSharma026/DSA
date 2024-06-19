package OOPS.Class2_19june;

public class StaticExample {
    public static void main(String[] args) {
        Human harshita = new Human(24, "Harshita", false);
        Human amit = new Human(23, "Amit", true);
        System.out.println(Human.population);
        System.out.println(Human.population);
        harshita.greetUser();   // i'm not getting any error here even though greetUser() is not static, its beacuse,
        // either you make it static or call it on its instance. here i'm calling this method on an object.
        amit.greetUser();
    }
}
