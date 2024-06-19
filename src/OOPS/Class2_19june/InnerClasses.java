package OOPS.Class2_19june;

class Test2 {
     static String name;
    Test2 (String name) {
        Test2.name = name;
    }
}

public class InnerClasses {

    // If i declare this class as static, then we can directly reference it without using object of outer class,
    // otherwise i need outer class' object to access this class

    // STATIC IN TERMS OF INNER CLASSES : means Test is not dependent on outer class InnerClasses (That's all)
    // means this class can have any number of objects inside of it, all separate objects
     static class Test {
        String name;

        Test (String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Here it was showing error if this Test class was not decalered as static, it is so because, this Test class
        // is dependent on another outer class "InnerClasses", so for it to run, we need to create outer class' obj first
//        InnerClasses innerClasses = new InnerClasses();
//        innerClasses.Test test = new innerClasses.Test("Shipra");

        // here two different object having different values for instance variables
        Test test = new Test("Harshita");
        Test test1 = new Test("Shipra");

        System.out.println(test.name);
        System.out.println(test1.name);

        // Here Test2 is not dependent on any class, that's why when we create its object, it's gonna recognize this as
        // a standalone class, hence it has valid object

        // here since "name" is set as static that means it doesn't depend on object
        Test2 test2 = new Test2("Amit");
        Test2 test3 = new Test2("Amiti");
        System.out.println(Test2.name);
        System.out.println(test2);

        // ---------- singleton
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.name);
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.name);
    }
}


