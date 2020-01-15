package com.codegymdanang.casestudy.repository;

import com.codegymdanang.casestudy.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
}
