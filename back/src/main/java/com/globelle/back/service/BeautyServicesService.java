package com.globelle.back.service;

import com.globelle.back.dao.BeautyServicesDAO;
import com.globelle.back.model.BeautyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeautyServicesService {

    @Autowired
    private BeautyServicesDAO beautyServicesDAO;

    public List<BeautyServices> getAllBeautyServices(){
        return (List<BeautyServices>) beautyServicesDAO.findAll();
    }
}
