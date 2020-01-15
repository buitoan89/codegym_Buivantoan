package com.example.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class User implements Validator {
    private String firstname;
    private String lastname;
    private int phonenumber;
    private int age;
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

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
             User user = (User)target;
             String lastname = user.getLastname();
             String firstname = user.getFirstname();
        ValidationUtils.rejectIfEmpty(errors, "lastname", "lastname.empty");
        ValidationUtils.rejectIfEmpty(errors, "firstname", "lastname.empty");
        ValidationUtils.rejectIfEmpty(errors, "phonenumber", "phonenumber.empty");
        ValidationUtils.rejectIfEmpty(errors, "age", "age.empty");
        ValidationUtils.rejectIfEmpty(errors, "email", "email.empty");

//        if (!this.emailValidator.isValid(user.getEmail())) {
//            // Email không hợp lệ.
//            errors.rejectValue("email", "Pattern.appUserForm.email");
//        } else if (user.getUserId() == null) {
//            AppUser dbUser = appUserDAO.findAppUserByEmail(appUserForm.getEmail());
//            if (dbUser != null) {
//                // Email đã được sử dụng bởi tài khoản khác.
//                errors.rejectValue("email", "Duplicate.appUserForm.email");
//            }
//        }


    }
}
