package com.globelle.back.service;

import com.globelle.back.dao.ProviderDAO;
import com.globelle.back.model.BeautyService;
import com.globelle.back.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderDAO providerDAO;

    public List<Provider> getAllProviders(){
        return (List<Provider>) providerDAO.findAll();
    }

    public Optional<Provider> getProvider(int id) {
        return providerDAO.findById(id);
    }

    public List<Provider> getProviderByBeautyServicesName(String name) {
        return providerDAO.findProviderByBeautyServicesName(name);
    }

//    public Provider getProviderById(int id) {
//        Optional<Provider> p = providerDAO.findById(id);
//        return p.orElse(null);
//    }

    public Provider insertProvider(Provider p) {
        p.setId(null);
        return providerDAO.save(p);
    }

    public void deleteProvider(int id) {
        providerDAO.deleteById(id);
    }

    public Provider updateProvider(Provider p, int id) {
        p.setId(id);
        return providerDAO.save(p);
    }
}
