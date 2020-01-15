package com.codegymdanang.casestudy.service.serviceiplm;

import com.codegymdanang.casestudy.entity.Role;
import com.codegymdanang.casestudy.entity.User;
import com.codegymdanang.casestudy.repository.UserRepository;
import com.codegymdanang.casestudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceIplm implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    @Transactional

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user=userRepository.findByEmail(s);
        if (user ==null ){
            throw new UsernameNotFoundException("user is not found");
        }
        Set<GrantedAuthority> grantedAuthorities= new HashSet<>();
        Set<Role> roles = user.getRoles();
        for (Role role:roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),grantedAuthorities);
    }
}
