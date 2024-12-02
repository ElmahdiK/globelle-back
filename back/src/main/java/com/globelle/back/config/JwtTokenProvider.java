package com.globelle.back.config;
import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenProvider {

    //  generate with https://jwtsecret.com/generate
    private String jwtSecret = "258de0d61ec3c09c68cbeaff89b512b0d22d7bd8dba081dd9de28ebb9422661c83fc973f4ef22e355a972f46cbc8f5c56cc9b82b4972d73a7d76df071d7dd226fee9e411fea07d7dd800b7269c16dd40cdad463035f424e1d8eb3e6d9731e0497ccb920fedfbd16d1f243bfb19e8bb9ba2921014019b8085bd6ba92464581e1ee67df08227910d0135b35076df118d9bc6fbf5f9b190bcd2c8f6ea1bd5fe2ffa5b9ecf90bbb75e2b8d913dd1c3bd2a5dcb6f1b6c01c492456dbbfc781ff0e298e3bd2bffa6b36b90ab6b72741c19bffab8c3652c8ae2bb538b944b673e79c3857fb5bb61f76c4681c820f76b7d4fa5bc49af4b70019791d7172cf29808997a1d";
    private long jwtExpirationDate = 3600000; //1h = 3600s and 3600*1000 = 3600000 milliseconds

    public String generateToken(Authentication authentication) {
        String username = authentication.getName();
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime() + jwtExpirationDate);

        // Get user roles from authentication
        String[] roles = authentication.getAuthorities().stream()
                .map(authority -> authority.getAuthority())
                .toArray(String[]::new);

        String token = Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(expireDate)
                .claim("roles", roles) // Add roles to token claims
                .signWith(key(), SignatureAlgorithm.HS256)
                .compact();

        return token;
    }

    private Key key(){
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

    // extract username from JWT token
    public String getUsername(String token){
        return Jwts.parser()
                .verifyWith((SecretKey) key())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    // Get roles from JWT token
    public String[] getRoles(String token) {
        return Jwts.parser()
                .verifyWith((SecretKey) key())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .get("roles", String[].class);
    }

    // validate JWT token
    public boolean validateToken(String token){
        Jwts.parser()
                .verifyWith((SecretKey) key())
                .build()
                .parse(token);
        return true;
    }
}