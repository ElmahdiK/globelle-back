package com.globelle.back.service;

import com.globelle.back.dao.UserDAO;
import com.globelle.back.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<User> getAllUsers(){
        return (List<User>) userDAO.findAll();
    }

    public Optional<User> getUser(int id) {
        return userDAO.findById(id);
    }

    public List<User> getAllUsersProviders() {
        return (List<User>) userDAO.findAllProviders();
    }

    public List<User> getUserByBeautyServicesName(String name) {
        return userDAO.findUserByBeautyServicesName(name);
    }

    public User insertUser(User p) {
        p.setId(null);
        return userDAO.save(p);
    }

    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }

    public User updateUser(User p, int id) {
        p.setId(id);
        return userDAO.save(p);
    }

}
