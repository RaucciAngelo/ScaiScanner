package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    // Classic CRUD
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);

    }

    public void updateUser(Long id, User user) {
        User newuser = new User();
        newuser = userRepo.getReferenceById(id);
        newuser.setName(user.getName());
        newuser.setSurname(user.getSurname());
        newuser.setTaxcode(user.getTaxcode());
        newuser.setPrenotationList(user.getPrenotationList());
        newuser.setRoles(user.getRoles());
        newuser.setUsername(user.getUsername());
        newuser.setEmail(user.getEmail());
        newuser.setPassword(user.getPassword());
        userRepo.save(newuser);
    }

    // Custom Methods

    public User getUser(Long id) {
        return userRepo.getReferenceById(id);
    }

    public void updateUserCredentials(Long id, User user) {
        User existingUser = new User();
        existingUser = userRepo.getReferenceById(id);
        existingUser.setEmail(user.getEmail());
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        userRepo.save(existingUser);
    }


}
