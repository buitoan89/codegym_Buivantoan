package bai_tap_giai_thuat;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        int s1 = 1;
        int s2 = 1;
        for (int i =1;i<=n;i++){
            if (i%2==0){
                s1=s1*i;
                ;

            }else {
                s2=s2*i;


            }

        }
        System.out.println("s1="+ s1 + "\n" + "s2="+ s2);
    }
}
