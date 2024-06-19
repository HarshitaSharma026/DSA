package OOPS;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Class1_18June {

    static class Applicant {
        // 1. Instance variables
        int applicant_id;
        String company;
        String position;

        // 3. CONSTRUCTOR- can be think of as a special type of method whose return type is the class itself, it doesn't need to have a name
        // 3.1. Default constructor
        Applicant () {
            // 4. harshita.applicant_id, harshita.company
            // this one is getting reptitive as these assignment is done already inside parameterized constructor
            // to solve this we can call parameterized constructor inside this constructor

//            this.applicant_id = -1;
//            this.company = "no company";
//            this.position = "no position";
            this (-1, "no company", "no position");
        }

        // 3.2. Parameterzied constructor
        Applicant (int applicant_id, String company, String position) {
            this.applicant_id = applicant_id;
            this.company = company;
            this.position = position;
        }
    }

     static class CheckFinal {
        final int VALUE = 100;
        int age;

        CheckFinal (int age) {
            this.age = age;
        }

//         @Override
//         protected void finalize() throws Throwable {
//             super.finalize();
//         }
     }
    public static void main(String[] args) {
        // 1. Reference variable - its pointing to null
        Applicant harshita;
        // 2. "new" - dynamically assigns memory to this reference variable. dynamic memory allocation
        harshita = new Applicant();

        System.out.println(harshita.applicant_id);
        System.out.println(harshita.company);
        System.out.println(harshita.position);

        Applicant amit = new Applicant(2, "Facebook", "SE");
        System.out.println(amit.applicant_id);
        System.out.println(amit.company);
        System.out.println(amit.position);

        // 5. One object pointing to another object
        // it is simple pointing to another object, no space is assigned.

        Applicant applicant1 = new Applicant(10, "Ostra", "Software Tester");
        Applicant applicant2 = applicant1;
        System.out.println(applicant2.applicant_id);
        applicant2.applicant_id = 100;
        System.out.println(applicant2.company);
        System.out.println(applicant2.position);
        System.out.println(applicant1.applicant_id);

        // 6. Primitives are not implmeneted as object, hence we don't use new keyword to create them, hence they are stored in the stack memory
        // But we can implement them as object explicitly using Wrapper classes
        int a = 10;             // --> primitive, pass by value
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        // --- here when we are calling swap(), its passing values 10, and 20 as parameters, and not a and b, that's why the values are not swapped.
        // --- beacuse actual values of a never changed (unless we pass it from the method)

        Integer aa = 10;        // --> object, pass by reference
        Integer bb = 20;
        swapWrapper(aa, bb);
        System.out.println(aa + " " + bb);
        // --- it still didn't swap ? why ?? It should have been swapped, beacuse now aa nd bb are objects, so they should be passed by reference
        // --- because Integer class is set to "final"

        // 7. "final" - to prevent content to be modified
        // so when we are creating aa, bb, they are automatically set to final, hence we can't change its value.
        float INCREASE = 0.2f;

        // 7. "final", if any instance variable is declared as final, will we able to change its value for every object that created?
        CheckFinal f1 = new CheckFinal(20);
//        f1.VALUE = 90;          // reassignment is not possible, beacuse if a primitive is defined as "final", then its value can never change, VALUE is a primitive and set to final
        System.out.println(f1.VALUE);

        // here i've creatd an object as final, we might think that since its set to final, we can't modify this objects values
        // the actual answer is: we can change the values of this objects but we can reassign them.
        // here CheckFinal is not a primitive, hence we can change it's value
        final CheckFinal f2 = new CheckFinal(45);
        f2.age = 67;

//        f2 = new CheckFinal(100);       // this will show an error, beacuse we are reassigning here, when a non primitive is final we can't reassign it.


        // 8. Garbage collection - done by JVM automatically.
        // but there are some method using which we can specify what task to perform on the objects that are going to be deleted by JVM
        // like releasing the resources, or closing a file
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swapWrapper(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
