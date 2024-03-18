package JavaConcepts.staticExample;

// here outer classes can't be static, but inner classes can be static

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // the last 2 statement are showing an error beacuse, the class is dependent on outer class
        // but if we place this Test class outside, then it'll not show eror, because in this case it'll not be dependent on any outer class
//        Test a = new Test("Harshita");
//        Test b = new Test("Amit");

        // but if we declare Test class as static, in that case it'll work
        // beacuse now Test class is not dependent on objects of its outer class
        Test a = new Test("Harshita");
        Test b = new Test("Amit");
    }
}
