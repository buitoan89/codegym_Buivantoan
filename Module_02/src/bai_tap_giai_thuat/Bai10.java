package bai_tap_giai_thuat;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        n = scanner.nextLine();
        int length= n.length();
//        String[] tach = n.split("\\s");
//
//        for (String tu :tach ) {
//            System.out.println(tu);
//
//
//        }
int counst=0;
        for (int i=0;i<length;i++){
            char charactor= n.charAt(i);
         //   if (Character.isSpaceChar(charactor)){
            if (Character.isSpaceChar(charactor)){
                counst++;
                System.out.println();
            }else {

                System.out.print(charactor);
            }
        }
        System.out.println("so tu" + counst);
        }


}
