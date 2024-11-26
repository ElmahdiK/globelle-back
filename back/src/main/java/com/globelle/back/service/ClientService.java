package com.globelle.back.service;

import com.globelle.back.dao.ClientDAO;
import com.globelle.back.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientDAO clientDAO;

    public List<Client> getAllClients(){
        return (List<Client>) clientDAO.findAll();
    }

    public Optional<Client> getClient(int id) {
        return clientDAO.findById(id);
    }

}
