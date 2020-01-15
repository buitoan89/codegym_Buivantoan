package com.codegym.demo_gio_hang.controller;

import com.codegym.demo_gio_hang.model.MyCart;
import com.codegym.demo_gio_hang.model.Product;
import com.codegym.demo_gio_hang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @ModelAttribute("cart")
    public MyCart setUpCart(){
        return new MyCart();
    }

    @Autowired
   private ProductService productService;

    @GetMapping("/list")
    public ModelAndView listProduct(){
        Iterable<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/detail-product/{id}")
    public ModelAndView detailProduct(@PathVariable Long id){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("show_product");
        modelAndView.addObject("products",product);
        return modelAndView;
    }
    @PostMapping("/add-to-cart/{id}")
    public ModelAndView addProduct(@PathVariable Long id, @ModelAttribute("cart") MyCart myCart ){
           Product product = productService.findById(id);
           ModelAndView modelAndView = new ModelAndView("show_product");
           modelAndView.addObject("products",product);
           if (product==null){
                modelAndView.addObject("messenger","lỗi");
           }else {
               myCart.addToCart(product);
               modelAndView.addObject("messenger","thêm :"
                       + product.getNameProduce() + " thành công / số lượng :" + myCart.getAmount(product));
           }

        return modelAndView;
    }

    @GetMapping("/show_cart")
    public String showCart(){
        return "show_cart";
    }

    @GetMapping("/delete-product/{id}")
    public String delete(@PathVariable("id") Long id,@ModelAttribute("cart") MyCart myCart){
        myCart.remove(productService.findById(id));
        return "redirect:/show_cart";
    }


    @GetMapping("/a")
    public String test(){
        return "test";
    }


}
