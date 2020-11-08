package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.City;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UnauthorizedUserException;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class UserServiceTest {
     @Mock
    private UsersDao usersDao;

     @InjectMocks
    private UserServiceImpl userService;

     @BeforeEach
     public void setupMockito() {
         Mockito.when(usersDao.save(new Users("save_test"))).thenReturn(new Users(1, "save test"));

         Mockito.when(usersDao.findById(1)).thenReturn(Optional.of(new Users(1, "save test")));
         Mockito.when(usersDao.save(new Users(1, "update test"))).thenReturn(new Users(1, "update test"));

         Mockito.when(usersDao.save(new Users("get test"))).thenReturn(new Users(1, "get test"));
         Mockito.when(usersDao.findByFirstName("get test")).thenReturn(Collections.singletonList(new Users(1, "get test")));
     }
    @Test
    public void testCreateUser() {
        Users users = new Users();
        users.setFirstName("save test");
        Users savedUser = userService.createUser(users);
        Assertions.assertNotNull(savedUser);
        Assertions.assertTrue(savedUser.getUserId() != 0);
        Assertions.assertEquals("save test", savedUser.getFirstName());
    }

    @Test
    public void testGetUser() throws UnauthorizedUserException {
        Users users = new Users();
        users.setFirstName("save test");
        List<Users> getUser =  userService.getUser(users.getFirstName());
        Assertions.assertNotNull(getUser);
//      Assertions.assertTrue(getUser.getUserId() != 0);
//      Assertions.assertEquals("save test", getUser.getFirstName());
    }
}
