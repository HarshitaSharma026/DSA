package OOPS.Class2_19june;

// "SINGLETON" : we can only have one instance of this class

public class Singleton {
    // if we restrict creating the constructor of this class, then we won't be able to create objects
    String name;
    private static Singleton instance;
    private Singleton () {
        name = "Harshita";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
