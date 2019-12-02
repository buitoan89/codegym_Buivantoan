package models;

import java.util.Date;

public class Customer extends Services{
  private   String nameCustomer;
  private   String birthday;
  private   String render;
  private  int idCart;
  private   int phoneNumber;
  private    String email;
  private    String typeCustomer;
  private  String adress;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthday, String render, int idCart, int phoneNumber, String email, String typeCustomer, String adress) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.render = render;
        this.idCart = idCart;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.adress = adress;
    }

    public Customer(String id, String name, double areaUsed, double rentalCost, int maxNumberOfPeaple, String typeRent, String nameCustomer, String birthday, String render, int idCart, int phoneNumber, String email, String typeCustomer, String adress) {
        super(id, name, areaUsed, rentalCost, maxNumberOfPeaple, typeRent);
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.render = render;
        this.idCart = idCart;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.adress = adress;
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

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public int getIdCart() {
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
    public String showInfor() {
        return "\n name customer:"+ this.nameCustomer +
                "\n gender customer:"+ this.render+
                "\n id card customer"+ this.idCart+
                "\n phone number:"+ this.phoneNumber+
                "\n mail customer" + this.email+
                "\n type customer:" + this.typeCustomer+
                "\n adress customer:"+ this.adress+
                "\n birthday customer"+ this.birthday;
    }
}

