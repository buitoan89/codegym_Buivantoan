package bai_tap_giai_thuat;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int firsNumber, secondNumber, temp1,temp2,uscln,bscnn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat");
        firsNumber = scanner.nextInt();
        System.out.println("Nhap so thu hai");
        secondNumber = scanner.nextInt();

        while ((firsNumber<=0)||(secondNumber <=0)){
            System.out.println("Nhap lai hai so nguyen");
            System.out.println("Nhap so thu nhat");
            firsNumber = scanner.nextInt();
            System.out.println("Nhap so thu hai");
            secondNumber = scanner.nextInt();
        }
        //tim uscln
        temp1 = firsNumber;
        temp2 = secondNumber;
        while (temp1!=temp2){
            if (temp1>temp2){
                temp1-=temp2;
            }else {
                temp2-=temp1;
            }
        }
        uscln = temp1;
        System.out.println("Uscl" + uscln);
        System.out.println("Bcnn" +((firsNumber*secondNumber)/uscln) );
    }
}
