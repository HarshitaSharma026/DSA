package JavaConcepts;

public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        int b = 90;

        Integer c = 100;            // here "c" is integer object so we can access all of Integer class' methods
        Integer d = 900;

        swap1(a, b);
        swap2(c, d);
        System.out.println(a + ", " + b);

        //------ FINAL WITH PRIMITIVES
        final int value = 45;           // ------------- here we can't change "FINAL" variable
        // -------------- "FINAL" variables have to be initialized, since we can't modify it that why it has to be initialized always

        // --------- FINAL WITH NON PRIMITIVES
        final A std1 = new A("harshita");
        std1.name = "Harshita";                 // so here if we declare a non primitve as final, then we can make changes to its value
//        std1 = new A("Minni");              // but we can't reassign it, where we are assigning std1 to new object, this is not possible
            // so the above command will show an error

        // ------------ finalize() method
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("new new object");
        }

    }

    static void swap1(int a, int b) {
        // here in this case it'll not swap because, here only 10, and 90 is passed,
        // means pass by value, and not the actual reference.
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer a, Integer b) {
        // here in this case also it'll not swap because,
        // even though the values here are pass by reference objects,
        // it's because Integer class is set to "final" means we can't modify its values
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    String name;

    public A(String name) {
        this.name = name;
    }

//    @Override
    // in java we can't free up memory or unused objects, but java allows us to do something when the garbage collector
    // deletes the unused objects
    // it done using finzlize() method -> this one is deprecated, ** look for alternative **
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed !!");
//    }
}
