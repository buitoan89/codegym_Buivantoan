package bai_tap_giai_thuat;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}




