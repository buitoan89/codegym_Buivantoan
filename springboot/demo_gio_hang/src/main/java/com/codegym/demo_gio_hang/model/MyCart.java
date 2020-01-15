package com.codegym.demo_gio_hang.model;

import java.util.HashMap;
import java.util.Map;

public class MyCart {
    private Map<Product,Integer> map ;
    public MyCart() {
        map= new HashMap<>();
    }
    public void addToCart(Product product){
        if (map.containsKey(product)){
            map.replace(product,map.get(product)+1);
        }else {
            map.put(product,1);
        }
    }
    public Map<Product, Integer> getMap() {
        return map;
    }
    public int getAmount(Product product){
        return map.get(product);
    }
    public void remove(Product product){
        map.remove(product);
    }
}
