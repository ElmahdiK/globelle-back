package com.globelle.back.service;

import com.globelle.back.dao.BeautyServiceDAO;
import com.globelle.back.model.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BeautyServiceService {

    @Autowired
    private BeautyServiceDAO beautyServiceDAO;

    public List<BeautyService> getAllBeautyServices(){
        return (List<BeautyService>) beautyServiceDAO.findAll();
    }

    public Optional<BeautyService> getBeautyService(int id) {
        return beautyServiceDAO.findById(id);
    }

    /*
    public List<BeautyServices> getAllBeautyServices(int idProvider){
        return beautyServicesDAO.findById(id);
    }*/

    public List<BeautyService> getAllBeautyServicesByProviderId(Integer id) {
        List<BeautyService> beautyServicesByProviderList = new ArrayList<>();
        for(BeautyService service: getAllBeautyServices()){
            beautyServicesByProviderList.add(beautyServiceDAO.findBeautyServiceByProviderId(id));
        }

        return beautyServicesByProviderList;
    }

}
