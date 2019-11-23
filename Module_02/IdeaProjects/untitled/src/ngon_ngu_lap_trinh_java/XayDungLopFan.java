package ngon_ngu_lap_trinh_java;

public class XayDungLopFan {
    static final int Slow =1;
    static final int MEDIUM =2;
    static final int FAST =3;
    private int speed=Slow;
    private boolean isOn;
    private double radius =5;
    private String color="blue";

    public static int getSlow() {
        return Slow;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getStatus() {
        if(this.isOn){
            return "fan is on";
        }
        else {
            return "fan is off";
        }
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public XayDungLopFan(){


    }

    @Override
    public String toString() {
        return "XayDungLopFan{" +
                "speed=" + speed +
                ", on=" + this.isOn +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", color='" + this.getStatus() +
                '}';
    }

    public static void main(String[] args) {
        XayDungLopFan fan1 = new XayDungLopFan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        XayDungLopFan fan2 = new XayDungLopFan();
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan2.toString());






    }


}
