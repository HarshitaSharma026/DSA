package JavaConcepts.staticExample;

public class StaticBlock {
    static int a = 90;
    static int b;
//    b = 100;      // this will show an error, why ??

    // b is intilized using a static block
    // this "static block" gets executed excatly once when program is first loaded

    static {
        b = 100;
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
