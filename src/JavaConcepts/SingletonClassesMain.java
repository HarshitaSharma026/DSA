package JavaConcepts;

public class SingletonClassesMain {
    public static void main(String[] args) {
//        SingletonClasses sc = new SingletonClasses();
//        sc.num = "78";
        // here this one is giving me error beacuse num variable is set to private
        // but here the concept of singleton classes is not met, beacuse we can create as many objects of this class as we want

        // but if we declare constructor as private, then we won't be able to create its objects

        SingletonClasses obj3 = SingletonClasses.getInstance();
        SingletonClasses obj2 = SingletonClasses.getInstance();
        SingletonClasses obj1 = SingletonClasses.getInstance();
        // no matter how many times we create object of this class, only single instance we'll be sent back to each reference variable 
    }
}
