package ke_thua;

public class Cylinder extends Circle1 {
    private double height;
    public Cylinder(){

    }
    public Cylinder(double radius , String color,double height){
        super(radius, color);
        this.height=height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height
                +getVolume()+
                '}'
                +"extender paren class"+super.toString();
    }
}
