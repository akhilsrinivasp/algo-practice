package day_4;

// Problem: https://codeforces.com/problemset/problem/4/A
import java.util.Scanner;
public class AWatermelon_CF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        s.close();
    }
}


