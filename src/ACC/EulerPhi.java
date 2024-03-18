package ACC;

public class EulerPhi {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(EulerTotient(n));
    }
     static int EulerTotient(int n) {
        int ans = n;
         for (int i = 2; i <= n; i++) {
             if (n % i == 0) {
                 ans = ans - ans / i;
             }
             while (n % i == 0) {
                 n= n / i;
             }
         }
         if (n > 1) {
             ans = ans - ans / n;
         }
         return ans;
     }
}
