package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String ngaysinh;
    String diachi;
    String hinhanh;

    public Customer() {
    }

    public Customer(String name, String ngaysinh, String diachi, String hinhanh) {
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.hinhanh = hinhanh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

   static List<Customer> list;


   static  {
        list = new ArrayList<>();
        list.add(new Customer("toan", "123", "dd", "ww"));
        list.add(new Customer("toan", "123", "dd", "ww"));
        list.add(new Customer("toan", "123", "dd", "ww"));
        list.add(new Customer("toan", "123", "dd", "ww"));

    }
    public static List<Customer> getList(){
       return list;
    }
}
