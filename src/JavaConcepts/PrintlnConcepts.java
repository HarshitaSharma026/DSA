package JavaConcepts;

public class PrintlnConcepts {
    public static void main(String[] args) {
        B b = new B("Harshita");

        // if we directly prints the object "b", its going to print something that seems gibrish to us
        // it is so beacuse, println() method internally calls toString() method, which has to be overriden in the class
        // but if we don't override this method, then it'll call default toString() method, and this method has a format to print the output
        // so the output of the below statement: JavaConcepts.B@2f92e0f4, is according to this format only.
        System.out.println(b);
    }

}

class B {
    String name;

    public B(String name) {
        this.name = name;
    }
}
