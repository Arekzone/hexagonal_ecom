package com.example.testowaniehibernate.User.application;

import com.example.testowaniehibernate.User.core.UsersService;
import com.example.testowaniehibernate.User.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserFacade {

    private UsersService usersService;

    public UserFacade(UsersService usersService) {
        this.usersService = usersService;
    }

    public void addUser(String string){
        Users user = new Users();
        user.setNazwa(string);
        usersService.addUser(user);
    }
    public Optional<Users> findbyId(Long id){
        return usersService.findById(id);
    }

}
