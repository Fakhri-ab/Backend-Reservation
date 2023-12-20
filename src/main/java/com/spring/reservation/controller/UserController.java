package com.spring.reservation.controller;

import com.spring.reservation.entities.User;
import com.spring.reservation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Api/User")
public class UserController {
    @Autowired
    UserService userService ;

    @PostMapping("/SignUp")
    public User SignUp(@RequestBody User user){
        return   userService.SignUpUser(user) ;
    }
    @GetMapping("/GetUserById/{id}")
    public Optional<User> GetUserById(@PathVariable Long id){
        return userService.GetUserBYId(id) ;
    }
}
