package com.globelle.back.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.globelle.back.dao.RoleDao;
import com.globelle.back.model.Role;
import com.globelle.back.model.RoleEnum;
import com.globelle.back.model.User;
import com.globelle.back.dao.UserDAO;

import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserDAO userDao;

    @Override
    public void run(String... args) throws Exception {
        // Get all existing roles from RoleEnum
        for (RoleEnum roleEnum : RoleEnum.values()) {
            // Check if role exists
            if (roleDao.findByName(roleEnum.toString()).isEmpty()) {
                // Create and save new role if it doesn't exist
                Role newRole = new Role();
                newRole.setName(roleEnum.toString());
                roleDao.save(newRole);
            }
        }

        /*
        // Create admin user if not exists
        if (userDao.findByUsername("admin").isEmpty()) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setEmail("admin@example.com");
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode("admin");
            admin.setPassword(encodedPassword);
            admin = userDao.save(admin);
            Role adminRole = roleDao.findByName(RoleEnum.PROVIDER.toString()).get();
            admin.setRoles(Set.of(adminRole));
            admin = userDao.save(admin);
        }

        // Create user user if not exists
        if (userDao.findByUsername("user").isEmpty()) {
            User user = new User();
            user.setUsername("user");
            user.setEmail("user@example.com");
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode("user");
            user.setPassword(encodedPassword);
            user = userDao.save(user);
            Role userRole = roleDao.findByName(RoleEnum.CLIENT.toString()).get();
            user.setRoles(Set.of(userRole));
            user = userDao.save(user);
        }
        */
    }
}