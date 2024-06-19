package OOPS.Class2_19june;

public class Human {
    int age;
    String name;
    boolean isMarried;
    static int population;

    public Human(int age, String name, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        Human.population += 1;
    }


    public static void speak() {
        // here it'll show me an error, beacuse calling a non static method within a static block is not possible
        // as static block are not dependent of objects, but greetUser() is dependent on object.
//        greetUser();
        System.out.println("I'm speaking !!" + Human.population);
//        System.out.println("I'm speaking !!" + this.population);
//        this.population will throw an error -> can't use "this" keyword inside static block, as "this" points to object
    }
    public void greetUser() {
        speak();
        System.out.println("Hello " + this.name);
    }
}
