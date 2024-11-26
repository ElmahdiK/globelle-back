package com.globelle.back.service;

import com.globelle.back.dao.ProviderDAO;
import com.globelle.back.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderDAO providerDAO;

    public List<Provider> getAllProviders(){
        return (List<Provider>) providerDAO.findAll();
    }
}
