package commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = " ";
    private static Scanner sc;


    //Check name valid
    public static boolean CheckName(String str) {
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

    public static boolean CheckValedGender(String str){
     //  regex  = "^[mM][Aa][Ll][Ee]|[Ff][Ee][Mm][Aa][Ll][Ee]|[Uu][Nn][Kk][Oo][Ww][n]$";
        regex  = "^(?i)(male)|(female)|(unknow)$";
        return str.matches(regex);

    }

    public static boolean CheckMail(String str){
        regex ="^[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]{2,3}";
        return str.matches(regex);

    }
    public static boolean checkBirthday(String str) {
        regex = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
        return str.matches(regex);
    }



    public static void main(String[] args) {
        CheckValedNumberDouble("Nhap vao so double","sai kieu du lieu");

    }
}
