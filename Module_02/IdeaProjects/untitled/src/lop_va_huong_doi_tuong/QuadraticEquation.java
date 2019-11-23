package lop_va_huong_doi_tuong;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;



    public QuadraticEquation( double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double delta;
         delta = this.b*2 - 4*this.a*this.c;

        return delta;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        double a = scanner.nextDouble();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        System.out.println("nhap c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta=quadraticEquation.getDiscriminant();
        if (delta == 0) {
            double R1 = -quadraticEquation.getB() / (2 * quadraticEquation.getA());
            System.out.println("phuong trinh co hai nghiem kep R1=R2" + R1);
        } else if (delta > 0) {
            double R1 = (-quadraticEquation.getB() + (Math.sqrt(delta))) / (2 * quadraticEquation.getA());
            double R2 = (-quadraticEquation.getB() - (Math.sqrt(delta))) / (2 * quadraticEquation.getA());
            System.out.println("phuong trinh co hai nghiem" + "R1=" + R1 + " " + "R2=" + R2);
        } else System.out.println("phuong trinh vo nghiem");
    }

}
