package ArraysAndArraylists;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {1,2,3}
        };
        System.out.println("Max wealth: " + maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer: accounts) {
            if (getWealth(customer) > max)
                max = getWealth(customer);
        }
        return max;
    }

    static int getWealth(int[] cus) {
        int sum = 0;
        for (int money: cus) {
            sum += money;
        }
        return sum;
    }
}
