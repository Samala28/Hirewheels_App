package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.EmailIdNotUniqueException;
import com.upgrad.hirewheels.exceptions.UnauthorizedUserException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{


    @Autowired
public UsersDao usersDao;

    @Override
    public Users createUser(Users users) {

        return usersDao.save(users);
    }

    @Override
    public List<Users> getUser(String firstName) throws UnauthorizedUserException {
        List<Users> users =  usersDao.findByFirstName(firstName);
        if (users == null) {
            throw new UnauthorizedUserException("User not Registered " +firstName);
        }
        return users;
    }

    @Override
    public Users getEmailId(String email) throws UnauthorizedUserException{

        return usersDao.findByEmail(email)
                .orElseThrow(()->new EmailIdNotUniqueException("Email Already Exists EmailId: "+email));
    }

    @Override
    public Users getEmailIdAndPassWord(String email, String password) throws UnauthorizedUserException {
             Users users = getEmailIdAndPassWord(email,password);

             if(!password.equals(getEmailIdAndPassWord(users.getEmail(),users.getPassword()))){
                 throw new UnauthorizedUserException("nauthorized User ");
             }
        return usersDao.save(users);
    }


}
