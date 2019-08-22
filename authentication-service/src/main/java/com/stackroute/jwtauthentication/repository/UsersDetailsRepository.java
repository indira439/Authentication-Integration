package com.stackroute.jwtauthentication.repository;

import com.stackroute.jwtauthentication.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDetailsRepository extends JpaRepository<Users, Integer> {
    //    to get details of user by its name
    Users findByUserName(String userName);
}
