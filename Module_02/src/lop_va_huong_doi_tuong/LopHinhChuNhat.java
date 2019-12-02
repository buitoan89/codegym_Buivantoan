package lop_va_huong_doi_tuong;

public class LopHinhChuNhat {
    //creat properti
    double dai;
    double rong;
    //contructtor
    public LopHinhChuNhat(){

    }
    public LopHinhChuNhat(double dai,double rong){
        this.dai=dai;
        this.rong=rong;
    }

    public double dientich(){
        return this.rong*this.dai;
    }
    public double chuvi(){
        return (this.dai + this.rong)*2;
    }

    public String display(){
        return "hinh chu nhat {" +"chieu dai"+ dai +"chieu rong"+ rong +"}";
    }

}
