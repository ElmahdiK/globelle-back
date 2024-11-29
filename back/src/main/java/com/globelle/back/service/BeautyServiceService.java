package com.globelle.back.service;

import com.globelle.back.dao.BeautyServiceDAO;
import com.globelle.back.model.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<BeautyService> getAllBeautyServicesByProviderId(Integer id) {
        return beautyServiceDAO.findByProviderId(id);
    }

    public void deleteProvider(int id) {
        beautyServiceDAO.deleteById(id);
    }

    public BeautyService insertProvider(BeautyService bs) {
        bs.setId(null);
        return beautyServiceDAO.save(bs);
    }


    public BeautyService updateProvider(BeautyService bs, int id) {
        bs.setId(id);
        return beautyServiceDAO.save(bs);
    }

}
