package com.globelle.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.globelle.back.config.JwtTokenProvider;
import com.globelle.back.dto.LoginDto;
import com.globelle.back.dto.RegisterDto;
import com.globelle.back.model.User;
import com.globelle.back.dao.UserDAO;
import com.globelle.back.model.Role;
import com.globelle.back.dao.RoleDao;
import com.globelle.back.model.RoleEnum;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserDAO userDao;

    @Autowired
    private RoleDao roleDao;

    public String login(LoginDto loginDto) {

        // 01 - AuthenticationManager is used to authenticate the user
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getEmail(),
                loginDto.getPassword()
        ));

        /* 02 - SecurityContextHolder is used to allows the rest of the application to know
        that the user is authenticated and can use user data from Authentication object */
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // 03 - Generate the token based on username and secret key
        String token = jwtTokenProvider.generateToken(authentication);

        Optional<User> user = userDao.findByUsername(authentication.getName());
        System.out.println(user);

        // 04 - Return the token to controller
        return token;
    }

    public User register(RegisterDto registerDto, int idRole) {
        // Create new user from register DTO
        User user = new User();
        user.setUsername(registerDto.getUsername());
        user.setEmail(registerDto.getEmail());

        user.setLastname(registerDto.getLastname());
        user.setFirstname(registerDto.getFirstname());
        user.setPostalCode(registerDto.getPostalCode());
        user.setCity(registerDto.getCity());
        user.setAddress(registerDto.getAddress());
        user.setTelephone(registerDto.getTelephone());

        // Encode password using BCrypt
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(registerDto.getPassword());
        user.setPassword(encodedPassword);

        // Save user to database
        User savedUser = userDao.save(user);

        // Set user role by default
        Role userRole = roleqDao.findByName(idRole==1 ? RoleEnum.PROVIDER.toString() : RoleEnum.CLIENT.toString()).get();

        savedUser.getRoles().add(userRole);
        savedUser = userDao.save(savedUser);

        return savedUser;
    }

}