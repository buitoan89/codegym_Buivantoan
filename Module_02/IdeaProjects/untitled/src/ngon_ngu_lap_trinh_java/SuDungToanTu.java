package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args){
        float height;
        float width;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width :");
        width = scanner.nextFloat();
        System.out.println("Enter height" );
        height = scanner.nextFloat();

        float are = height*width;
        System.out.println("Area is : " + are);

    }
}
