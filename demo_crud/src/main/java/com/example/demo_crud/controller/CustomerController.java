package com.example.demo_crud.controller;

import com.example.demo_crud.model.Customer;
import com.example.demo_crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.nio.file.OpenOption;
import java.util.List;
import java.util.Optional;


@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/dangnhap")
    public ModelAndView formDangNhap(){
        ModelAndView modelAndView = new ModelAndView("customer/dangnhap");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/dangnhap")
    public ModelAndView checkDangNhap(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ModelAndView modelAndView =new ModelAndView("customer/dangnhap");
            return modelAndView;
        }else {
            customerService.findById(customer.getIdCustomer());
            ModelAndView modelAndView = new ModelAndView("customer/dangnhapthanhcong");
            return modelAndView;
        }
    }

    @GetMapping("/list")
    public ModelAndView showList(@RequestParam("s") Optional<String>s, Pageable pageable){
        Page<Customer> customers ;
        ModelAndView modelAndView = new ModelAndView("customer/list");
        if (s.isPresent()){
                customers=customerService.findAllByNameCustomer(s.get(),pageable);
                modelAndView.addObject("s",s.get());
        }else {
            customers = customerService.findAll(pageable);

        }
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
    @GetMapping("/create-customer")
    public ModelAndView showCustomer(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("customer/create");
            return modelAndView;
        }else {
            customerService.save(customer);
            ModelAndView modelAndView = new ModelAndView("customer/create");
            modelAndView.addObject("message","tao thanh cong");
            modelAndView.addObject("customer",new Customer());
            return modelAndView;
        }
    }


    @GetMapping("edit-customer/{id}")
    public ModelAndView showEdit(@PathVariable("id") Long idCustomer){
        Customer customer=customerService.findById(idCustomer);
        if (customer != null){
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView saveEdit(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer",customer);
        modelAndView.addObject("message","sua thanh cong");
        return modelAndView;

    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDelete(@PathVariable("id") Long idCustomer){
        Customer customer = customerService.findById(idCustomer);
        if (customer != null){
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete-customer")
    public String delete(@ModelAttribute("customer") Customer customer){
            customerService.remove(customer.getIdCustomer());
            return "redirect:list";
    }
}
