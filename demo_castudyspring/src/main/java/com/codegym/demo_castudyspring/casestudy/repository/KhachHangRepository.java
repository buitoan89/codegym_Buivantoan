package com.codegym.demo_castudyspring.casestudy.repository;

import com.codegym.demo_castudyspring.casestudy.entity.FuramaKhachHang;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends CrudRepository<FuramaKhachHang, Long> {
}
