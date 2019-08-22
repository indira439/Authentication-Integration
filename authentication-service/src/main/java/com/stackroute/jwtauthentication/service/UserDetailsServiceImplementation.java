package com.stackroute.jwtauthentication.service;

import java.util.ArrayList;

import com.stackroute.jwtauthentication.domain.Users;
import com.stackroute.jwtauthentication.domain.UsersDTO;
import com.stackroute.jwtauthentication.repository.UsersDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {
    @Autowired
    private UsersDetailsRepository usersDetailsRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users users= usersDetailsRepository.findByUserName(userName);
        if (users == null) {
            throw new UsernameNotFoundException("User not found with username: " + userName);
        }
        return new org.springframework.security.core.userdetails.User(users.getUserName(), users.getPassword(),
                new ArrayList<>());
    }
    public Users saveUser(UsersDTO userDetails)
    {
        Users newUser= new Users();
        newUser.setUserName(userDetails.getUserName());
        newUser.setPassword(passwordEncoder.encode(userDetails.getPassword()));
        return usersDetailsRepository.save(newUser);
    }
}

