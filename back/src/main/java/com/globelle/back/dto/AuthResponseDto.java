package com.globelle.back.dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accessToken;
    private String name;
}
