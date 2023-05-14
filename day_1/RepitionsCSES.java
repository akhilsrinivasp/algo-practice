import java.util.Scanner;

// Problem Link: https://cses.fi/problemset/result/6061641/

public class RepitionsCSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long m = 1;
        long i = 0;
        long j = 0;
        while (j < s.length()) {
            if (s.charAt((int)j) != s.charAt((int)i))
                i=j;
            m = Math.max(m, j-i+1);
            j++;
        }
        System.out.println(m);
        sc.close();
    }
}
