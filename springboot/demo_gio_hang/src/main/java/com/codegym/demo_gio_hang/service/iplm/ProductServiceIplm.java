package com.codegym.demo_gio_hang.service.iplm;

import com.codegym.demo_gio_hang.model.Product;
import com.codegym.demo_gio_hang.repository.ProductRepository;
import com.codegym.demo_gio_hang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceIplm implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

}
