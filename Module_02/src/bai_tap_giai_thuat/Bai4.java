package bai_tap_giai_thuat;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        double s = 0;
        int gt = 1;
        double Sum = 0;
        for (int i = 1; i < n; i++) {
            gt = gt * i;
            if (i % 2 == 0) {
                s = s + (double) 1 / gt;
            } else {
                s = s + (-1) * ((double) 1 / gt);
            }
            Sum = 15 + s;
        }

        System.out.println(Sum);
    }

}

