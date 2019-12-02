package bai_tap_giai_thuat;

public class Bai3 {
    private int n;


    public Bai3() {
    }

    public Bai3(int n) {
        this.n = n;
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getS(){
        double s = 0;
        for (int i=1 ; i<this.getN() ; i++){
            s= s + (double)1/(i);
        }
        return s;
    }

    @Override
    public String toString() {
        return "S=" + getS();
    }
}
