package com.spring.reservation.services;

import com.spring.reservation.entities.User;
import com.spring.reservation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements  IUserService{

    @Autowired
    UserRepo userRepo ;

    @Override
    public User SignUpUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public  Optional<User> GetUserBYId(Long id) {
        return userRepo.findById(id);
    }
}
