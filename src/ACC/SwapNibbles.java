package ACC;

// Program to swap two nibbles in a given number
public class SwapNibbles {

    static int swapNibbles(int x) {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }
    public static void main(String[] args) {
        int value = 150;
        System.out.println(swapNibbles(value));
    }
}
