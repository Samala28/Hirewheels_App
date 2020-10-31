package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersDao extends JpaRepository<Users,Integer> {
    public List<Users> findByFirstName(String firstName);
    public List<Users> findByFirstNameOrLastName(String firstName,String lastName);
    public List<Users> findByEmail(String email);
    public List<Users> findByMobileNumber(String mobileNumber);
}
