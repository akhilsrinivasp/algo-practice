import java.util.Scanner;

// https://cses.fi/problemset/task/1068

public class WeirdAlgorithmCSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0)
                n = (long) n / 2;
            else
                n = 3 * n + 1;
            System.out.print(n + " ");
        }
        sc.close();
    }
}