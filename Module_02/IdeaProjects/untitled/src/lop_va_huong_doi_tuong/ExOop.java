package lop_va_huong_doi_tuong;

import java.util.Scanner;

public class ExOop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double dai = scanner.nextDouble();
        System.out.println("nhap chieu rong");
        double rong = scanner.nextDouble();
        LopHinhChuNhat lophinhchunhat = new LopHinhChuNhat(dai,rong);
        System.out.println("Hinh chu nhat \n" + lophinhchunhat.display());
        System.out.println("Hinh chu nhat \n" + lophinhchunhat.dientich());
        System.out.println("Hinh chu nhat \n" + lophinhchunhat.chuvi());

    }
}
