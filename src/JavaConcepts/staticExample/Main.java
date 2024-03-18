package JavaConcepts.staticExample;

public class Main {
    public static void main(String[] args) {
        Human harshita = new Human("Harshita", 24, 789000, false);
        Human kunal = new Human("Kunal", 21, 46000, true);

        System.out.println(Human.population);
        // for this one first it'll check does "population" exists in harshita object, it's not, then does it exist in Human class, yes it does
        // and its a static variable, so java will increment it's value

        // for every object that is being created, this is how it'll evaluate and check

        // ------ convention to access static members is using class, but if we use object name, then also it'll work
        System.out.println(Human.population);

//        greeting();
        // this will show an error beacuse, we can't access something that is non-static inside a static block
        // it is so beacuse, static blocks do not have an instance, while non-static blocks have instance.
        // we can't have something that depends on objects inside a block that doesn't depend on object

        fun();              // this can be used here,
    }

    static void fun(){
        System.out.println("Funny moment");

         // this will work because, we are referencing greeting() using an object
        Main main = new Main();
        main.greeting();

    }


    void greeting(){
        System.out.println("Good morning");
        fun();      // -------- can access static member inside non static member
    }
}
