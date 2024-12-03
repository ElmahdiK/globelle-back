package com.globelle.back.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    private String username;
    private String email;
    private String password;

    private String lastname;
    private String firstname;
    private String postalCode;
    private String city;
    private String address;
    private String telephone;
}
