package com.globelle.back.service;

import com.globelle.back.dao.BeautyServicesDAO;
import com.globelle.back.model.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeautyServicesService {

    @Autowired
    private BeautyServicesDAO beautyServicesDAO;

    public List<BeautyService> getAllBeautyServices(){
        return (List<BeautyService>) beautyServicesDAO.findAll();
    }

    public Optional<BeautyService> getBeautyService(int id) {
        return beautyServicesDAO.findById(id);
    }

    /*
    public List<BeautyServices> getAllBeautyServices(int idProvider){
        return beautyServicesDAO.findById(id);
    }*/

}
