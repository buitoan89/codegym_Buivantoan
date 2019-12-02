package bai_tap_giai_thuat;

import java.util.Scanner;

public class testBaiTap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhap thang");
//        int thang = scanner.nextInt();
//
//        System.out.println("nhap nam");
//        int nam = scanner.nextInt();
//        Bai2 bai2 = new Bai2(thang,nam);
//        System.out.println(bai2.toString());
        System.out.println("chuoi n");
        int n = scanner.nextInt();
        Bai3 bai3=new Bai3(10);

        System.out.println(bai3.toString());



    }
}
