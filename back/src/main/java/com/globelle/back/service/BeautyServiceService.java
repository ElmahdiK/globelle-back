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

    public List<BeautyService> getAllBeautyServicesByUserId(Integer id) {
        return beautyServiceDAO.findByProviderId(id);
    }

    public void deleteBeautyService(int id) {
        beautyServiceDAO.deleteById(id);
    }

    public BeautyService insertBeautyService(BeautyService bs) {
        bs.setId(null);
        return beautyServiceDAO.save(bs);
    }

    public BeautyService updateBeautyService(BeautyService bs, int id) {
        bs.setId(id);
        return beautyServiceDAO.save(bs);
    }

}
