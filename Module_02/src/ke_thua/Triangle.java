package ke_thua;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
       double p = this.getPerimeter()/2;
       double Area = Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
       return Area;

    }

    public double getPerimeter(){
        double p = (this.side1 + this.side2 + this.side3);
        return p;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}'
                + " Area="+ getArea()
                +" Perimeter"+ getPerimeter();

    }
}
