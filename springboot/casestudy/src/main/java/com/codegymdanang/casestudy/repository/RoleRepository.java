package com.codegymdanang.casestudy.repository;

import com.codegymdanang.casestudy.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);
}
