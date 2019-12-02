package ke_thua;

public class Circle extends Shape {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(double radius,String color,boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getAria(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "A Circle with radius ="
                + getRadius()
                +",which is a subclass of"
                +super.toString();
    }
}
