package com.codegym.demo_castudyspring.casestudy.repository;

import com.codegym.demo_castudyspring.casestudy.entity.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);
}
