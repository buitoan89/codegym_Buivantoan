package bai_tap_giai_thuat;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {

        String n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        n = scanner.nextLine();
        char[] arrstr = n.toCharArray();
        int begin = 0;
        int end = arrstr.length - 1;
        char temp;
        while (end > begin) {
            temp = arrstr[begin];
            arrstr[begin] = arrstr[end];
            arrstr[end] = temp;
            end--;
            begin++;
        }
        String str = "";
        for (char y : arrstr) {
            str = str + y;
        }

        System.out.println("dao chuoi :" + str);


  //      System.out.println(str.toUpperCase());

  //      System.out.println(str.toLowerCase());
        //dung ma ascii de tru
        //https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
String strUpLow = "";
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

           if (Character.isUpperCase(character)) {
               character +=32;
          } else if (Character.isLowerCase(character)) {
               character -=32;
            }
           strUpLow = strUpLow+character;
        }
//
       System.out.println("hoa thuong"+ strUpLow);


    }
}
