import java.util.Scanner;
public class MissingNumberCSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long s=0;
        for(int i=0; i<n-1; i++) 
            s+=sc.nextInt();
        System.out.println(n*(n+1)/2 - s);
        sc.close();
    }
}