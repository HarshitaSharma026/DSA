package JavaConcepts;

public class ThisConstructors {

    static class Student {
        int rollno;
        String name;
        float marks;

        Student() {
            // Student rahul = new Student();
//            this.rollno = 100;                  // this.rollno => rahul.rollno
//            this.name = "Harshita";             // this.name => rahul.name
//            this.marks = 78.90f;                // this.marks => rahul.marks

            // ----------- this is how we can call one constructor from another constructor
            this(300, "New student", 89.67f);
        }

//        if we don't use the "this" keyword here then the new values are not getting initialized, beacuse it'll not know which values to put
        // so in this case it'll initialize it with default values
        Student(int rn, String nm, float m) {
            rollno = rn;
            name = nm;
            marks = m;
        }

        // --------------- here we are passing other object in the constructor
        Student(Student obj) {
            this.name = obj.name;               // harshita.name = aditi.name;
            this.rollno = obj.rollno;              // harshita.rollno = aditi.rollno;
            this.marks = obj.marks;             // harshita.marks = aditi.marks;
        }



        void greetings(){
            System.out.println("good morning " + name);
        }
    }
    public static void main(String[] args) {
        Student rahul = new Student();
        System.out.println(rahul.name);
        System.out.println(rahul.rollno);
        System.out.println(rahul.marks);

        Student aditi = new Student(200, "Aditi", 90.78f);
//        aditi.greetings();
        System.out.println(aditi.name);
        System.out.println(aditi.rollno);
        System.out.println(aditi.marks);

        Student harshita = new Student(aditi);
        System.out.println(harshita.name);
        System.out.println(harshita.rollno);
        System.out.println(harshita.marks);

        Student one = new Student();
        Student two = one;              // ** assigning one to two object will make the object "two" to point to object "one"
        one.name = "One one";
        System.out.println("Two name: " + two.name);

    }
}
