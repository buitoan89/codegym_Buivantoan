package com.codegym.demo_validate_info_use.model;

import javax.validation.constraints.*;

public class User {
    @NotBlank(message = "nhap firstname")
    @Pattern(regexp = "([\\p{Lu}]|[\\\\p{Lu}][\\p{Ll}]{1,})([\\s]([\\\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}",message = "nhap in hoa chữ cái đầu")
    @Size(min = 5 , max = 45, message = "tên phải có độ dài từ 5 đến 45 ký tự")
    private String firstname;
    @NotBlank(message = "nhap lastname")
    @Pattern(regexp = "([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}",message = "nhap in hoa chữ cái đầu")
    @Size(min = 5 , max = 45, message = "tên phải có độ dài từ 5 đến 45 ký tự")
    private String lastname;
    @Pattern(regexp = "[0-9]{2,3}")
    @Min(value = 18)
    //lỗi kiểu int patern chỉ dùng kiểu string
    private String age;
    // @Pattern(regexp = "[0][0-9]{10,11}+",message = "")
    @Pattern(regexp = "^0.*",message = "số điện thoại phải bắt đầu bằng số 0")
    @Pattern(regexp = "^[\\d]{10,11}$",message = "số điện thoại phải là 10 hoặc 11 số")
    private String phonenumber;

    @Pattern(regexp = "^[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]{2,3}",message = "email theo định dạng abc@abc.abc")
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }


}
