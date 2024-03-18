package JavaConcepts.staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static int population;
    // here we are decalring it as static beacuse for all the objects of human class, it is same,
    // for me population is 7 billion, for some other person also poulation is 7 billion
    // means this particular variable is not dependent on objects, its value remain same for all objects

    // ------ what is static then?
    // when a member or method is declared as static, means we can access them even before creating any object
    // it means static members are not dependent on object

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    static void message(){
//        System.out.println(this.age);
        // here we can use this keyword, beacuse this refers to object
    }
}
