import java.util.Scanner;

// Problem Link: https://cses.fi/problemset/task/1094

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long p = sc.nextInt();
        long r=0;
        for(int i=1; i<n; i++) {
            long c = sc.nextInt();
            if(p>c) r += p-c;
            else p=c;
        }
        System.out.println(r);
        sc.close();
    }
}
