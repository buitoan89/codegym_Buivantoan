package bai_tap_giai_thuat;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        double s = 1;
        int gt = 1;

        for (int i=1; i<=n ;i++){
            gt = 2*i-1;
            s= s + (double) 1/gt;
        }

        System.out.println(s);
    }
}
