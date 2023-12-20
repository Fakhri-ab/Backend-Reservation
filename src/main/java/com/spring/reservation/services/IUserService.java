package com.spring.reservation.services;

import com.spring.reservation.entities.User;
import com.spring.reservation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface IUserService {

   public User SignUpUser(User user);

   public Optional<User> GetUserBYId(Long id) ;



}
