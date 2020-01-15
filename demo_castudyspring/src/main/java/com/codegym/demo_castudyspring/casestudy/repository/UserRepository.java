package com.codegym.demo_castudyspring.casestudy.repository;

import com.codegym.demo_castudyspring.casestudy.entity.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
}
