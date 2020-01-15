package com.nhatoan.demo_thucthanh_customer.service.iplm;

import com.nhatoan.demo_thucthanh_customer.model.Province;
import com.nhatoan.demo_thucthanh_customer.repository.ProvinceRepository;
import com.nhatoan.demo_thucthanh_customer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceIplm implements ProvinceService {
@Autowired
  private   ProvinceRepository provinceRepository;


    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }
}
