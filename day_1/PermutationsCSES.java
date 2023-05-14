import java.util.Scanner;

// Problem Link: https://cses.fi/problemset/task/1070

public class PermutationsCSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 3) {
            for (int i = 2; i <= n; i += 2)
                System.out.print(i + " ");
            for (int i = 1; i <= n; i += 2)
                System.out.print(i + " ");
        } 
        else if (n == 3)
            System.out.println("NO SOLUTION");
        else
            System.out.println("1");
        sc.close();
    }
}
