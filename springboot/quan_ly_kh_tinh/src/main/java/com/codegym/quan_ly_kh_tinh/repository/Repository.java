package com.codegym.quan_ly_kh_tinh.repository;

import com.codegym.quan_ly_kh_tinh.model.Customer;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();

    void save(T temp);

    T findById(Long id);

    void remove(Long id);


}
