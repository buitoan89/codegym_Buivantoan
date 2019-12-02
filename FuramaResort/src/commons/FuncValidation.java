package commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = " ";
    private static Scanner sc;

    //Check name valid
    public static boolean CheckNameService(String str) {
        regex = "^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }

    //Check number double
    public static double CheckValedNumberDouble(String content, String errMes) {

        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception e) {
                System.out.println(errMes);
            }
        }
    }

    //Check number Interger
    public static Integer CheckValedNumberInterger(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println(errMes);
            }
        }
    }

    public static void main(String[] args) {
        CheckValedNumberDouble("Nhap vao so double","sai kieu du lieu");

    }
}
