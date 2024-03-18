package JavaConcepts;

// singleton classes are classes where you can only make 1 object
// so if i want to rectrcit people creating other objects of this class, so then i've to make constructor of singleton class as private

public class SingletonClasses {
//    private int num = 0;
    private SingletonClasses(){

    }

    private static SingletonClasses instance;
    static SingletonClasses getInstance() {
        if (instance == null) {
            instance = new SingletonClasses();
        }
        return instance;
    }
}
