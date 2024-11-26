package com.globelle.back.service;

import com.globelle.back.dao.ClientDAO;
import com.globelle.back.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientDAO clientDAO;

    public List<Client> getAllClients(){
        return (List<Client>) clientDAO.findAll();
    }
}
