package com.example.demo_crud.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCustomer")
    private Long idCustomer;

   @Column(name = "nameCustomer")
   @NotBlank(message = "nhap name")
   @Pattern(regexp = "([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}",message = "nhap in hoa chữ cái đầu")
   @Size(min = 5 , max = 45, message = "tên phải có độ dài từ 5 đến 45 ký tự")
   private String nameCustomer;


   @Column(name = "password")
   @NotBlank(message = "nhap password")
   private String password;

    public Customer() {
    }

    public Customer(String nameCustomer, String password) {
        this.nameCustomer = nameCustomer;
        this.password = password;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
