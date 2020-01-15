package com.nhatoan.demo_thucthanh_customer.controller;

import com.nhatoan.demo_thucthanh_customer.model.Customer;
import com.nhatoan.demo_thucthanh_customer.model.Province;
import com.nhatoan.demo_thucthanh_customer.service.CustomerService;
import com.nhatoan.demo_thucthanh_customer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private  CustomerService customerService;
    @Autowired
    private ProvinceService provinceService;
    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("/customer-list")
    public ModelAndView getListCustomer(@RequestParam("s") Optional<String> s, Pageable pageable){
        Page<Customer> customers;
        ModelAndView modelAndView = new ModelAndView("customer/list");
        if(s.isPresent()){
            customers = customerService.findAllByFirstname(s.get(),pageable);
            modelAndView.addObject("s",s.get());
            modelAndView.addObject("backlist","customer-list");
            modelAndView.addObject("tenlist","quay ve trang list");
        } else {
            customers = customerService.findAll(pageable);
        }
        modelAndView.addObject("customers", customers);

        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreatCustomer(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView getCreateCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("customer/create");
        }
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        modelAndView.addObject("message","dang ky thanh cong");
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showFormEditCustomer(@PathVariable("id") Long id) {
        //tim thay gia tri id thi thuc hien hien thi id do ra
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;
        } else {
            return new ModelAndView("/error.404");
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView getEditCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
     //   return "redirect:/customer-list";
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "cap nhat customer thanh cong");
        return modelAndView;
    }
    @GetMapping("/delete-customer/{id}")
    public ModelAndView showFormDeleteCustomer(@PathVariable("id") Long id){
        Customer customer = customerService.findById(id);
        if (customer !=null){
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }else {
            return new ModelAndView("/error.404");
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:/customer-list";

    }


}
