package com.codegym.demo_gio_hang.service;

import com.codegym.demo_gio_hang.model.Product;

import java.util.List;

public interface ProductService {
    Iterable<Product> findAll();
   // List<Product> findAll();
   Product findById(Long id);
}
