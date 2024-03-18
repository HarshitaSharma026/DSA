package JavaConcepts.Inheritance;

public class Species {
    private int age;
    String name;

    public Species() {
        this.age = -1;
        this.name = "species";
    }

    public Species(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("you're in species class");
    }
}

class Human extends Species {
    int legs;
    int hands;
    int ears;
    int eyes;

    Human() {
        super(26, "first human");
        this.legs = 2;
        this.eyes = 2;
        this.hands = 2;
    }
}
