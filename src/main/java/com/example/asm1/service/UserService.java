package com.example.asm1.service;

import com.example.asm1.entity.User;
import com.example.asm1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService{

    @Autowired
    UserRepo userRepo;

    public List<User> findAll(){
        return userRepo.findAll();
    }
    public User save(User user){
        return userRepo.save(user);
    }

    public Optional<User> findById(int id){
        return userRepo.findById(id);
    }

    public void delete(Integer id){
        userRepo.deleteById(id);
    }
}
