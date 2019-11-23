package bai_tap_giai_thuat;


import java.util.Scanner;

public class Bai2 {
    private int thang;
    private int nam;
    private int dayOfMonth;

    public Bai2() {
    }

    public Bai2(int thang, int nam) {
        this.thang = thang;
        this.nam = nam;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
       public void setDayOfMonth(int dayOfMonth){
        this.dayOfMonth=dayOfMonth;
       }
       public int getDayOfMonth(){
        return this.dayOfMonth;
       }

    public boolean getNamnhuan() {
        if (this.getNam() % 400 == 0)
            return true;

        // Nếu số năm chia hết cho 4 và không chia hết cho 100,
        // đó không là 1 năm nhuận
        if (this.getNam() % 4 == 0 && this.getNam() % 100 != 0)
            return true;

        // trường hợp còn lại
        // không phải năm nhuận
        return false;
    }


    public int getNgay() {
        switch (this.getThang()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.setDayOfMonth(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                this.setDayOfMonth(30);
                break;
            case 2:

                if (getNamnhuan()) {
                    this.setDayOfMonth(29);
                } else {
                    this.setDayOfMonth(28);
                }
                break;
        }
        return this.getDayOfMonth();
    }

    @Override
    public String toString() {
        return "so ngay trong thang la :"+this.getNgay();
    }
}
