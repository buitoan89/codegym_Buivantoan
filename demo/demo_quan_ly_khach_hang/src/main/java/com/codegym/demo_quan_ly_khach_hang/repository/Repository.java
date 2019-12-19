package com.codegym.demo_quan_ly_khach_hang.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);

}
