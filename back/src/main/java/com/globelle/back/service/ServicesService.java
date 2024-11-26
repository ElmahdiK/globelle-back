package com.globelle.back.service;

import com.globelle.back.dao.ServicesDAO;
import com.globelle.back.model.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {

    @Autowired
    private ServicesDAO servicesDAO;

    public List<Services> getAllServices(){
        return (List<Services>) servicesDAO.findAll();
    }
}
