package com.globelle.back.service;

import com.globelle.back.dao.BeautyServicesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeautyServicesService {

    @Autowired
    private BeautyServicesDAO beautyServicesDAO;

    public List<BeautyServices> getAllBeautyServices(){
        return (List<BeautyServices>) beautyServicesDAO.findAll();
    }

    public Optional<BeautyServices> getBeautyService(int id) {
        return beautyServicesDAO.findById(id);
    }

    /*
    public List<BeautyServices> getAllBeautyServices(int idProvider){
        return beautyServicesDAO.findById(id);
    }*/

}
