import java.util.Scanner;

public class NumberSpiralCSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long y = sc.nextLong(), x = sc.nextLong();
            long n = Math.max(x, y);
            long ans = n * n - n + 1;
            if (n % 2 == 0) 
                ans -=x-y;
            else 
                ans +=x-y;
            System.out.println(ans);
        }
        sc.close();
    }   
}

// Time Complexity: O(1)
// Space Complexity: O(1)