package models;

import java.util.Date;

public class Customer {
  private String id;
  private String nameCustomer;
  private String birthday;
  private String render;
  private int idCart;
  private int phoneNumber;
  private String email;
  private String typeCustomer;
  private String adress;
  private Services services;

    public Customer() {
    }

    public Customer(String id, String nameCustomer, String birthday, String render, int idCart, int phoneNumber, String email, String typeCustomer, String adress) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.render = render;
        this.idCart = idCart;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.adress = adress;
    }


    public String getId() {
        return id;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return render;
    }

    public void setGender(String render) {
        this.render = render;
    }

    public int getIdCard() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
            return "\n Id:"+ this.id +
                    "\n name customer:"+ this.nameCustomer +
                    "\n gender customer:"+ this.render+
                    "\n id card customer"+ this.idCart+
                    "\n phone number:"+ this.phoneNumber+
                    "\n mail customer" + this.email+
                    "\n type customer:" + this.typeCustomer+
                    "\n adress customer:"+ this.adress+
                    "\n birthday customer"+ this.birthday;
    }
}

