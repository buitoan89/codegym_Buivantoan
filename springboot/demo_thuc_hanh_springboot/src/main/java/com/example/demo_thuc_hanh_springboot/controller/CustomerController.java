package com.example.demo_thuc_hanh_springboot.controller;

import com.example.demo_thuc_hanh_springboot.model.Customer;
import com.example.demo_thuc_hanh_springboot.service.CustomerService;
import org.hibernate.result.UpdateCountOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
@Autowired
    CustomerService customerService;
@GetMapping("/list-customers")
    public ModelAndView listcustomers(Pageable pageable){
    Page<Customer> customers;
    customers = customerService.findAll(pageable);
    ModelAndView modelAndView = new ModelAndView("customer/list");
    modelAndView.addObject("customers",customers);
    return modelAndView;
}

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView creatCustomer(@ModelAttribute("customer") Customer customer ){
        System.out.println(customer);
    customerService.save(customer);
    ModelAndView modelAndView=new ModelAndView("customer/create");
    modelAndView.addObject("customer", new Customer());
    modelAndView.addObject("message","nhap thanh cong");
    return modelAndView;

    }

}
