package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UnauthorizedUserException;

import java.util.List;

public interface UserService {
    public Users createUser(Users users);
    public List<Users> getUser(String firstName) throws UnauthorizedUserException;
    public Users getEmailId(String email) throws UnauthorizedUserException;
    public Users getEmailIdAndPassWord(String email,String password)throws UnauthorizedUserException;
}
