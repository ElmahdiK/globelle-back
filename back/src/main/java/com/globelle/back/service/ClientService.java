package com.globelle.back.service;

import com.globelle.back.dao.ClientDAO;
import com.globelle.back.model.Client;
import com.globelle.back.model.Provider;
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

    public Client getProviderById(int id) {
        Optional<Client> c = clientDAO.findById(id);
        return c.orElse(null);
    }

    public void deleteClient(int id) {
        clientDAO.deleteById(id);
    }

    public Client insertClient(Client c) {
        c.setId(null);
        return clientDAO.save(c);
    }


    public Client updateClient(Client c, int id) {
        c.setId(id);
        return clientDAO.save(c);
    }
}
