package com.globelle.back.service;

import com.globelle.back.dao.OpinionsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionsService {

    @Autowired
    private OpinionsDAO opinionsDAO;

    public List<Opinions> getAllOpinions(){
        return (List<Opinions>) opinionsDAO.findAll();
    }

    public Optional<Opinions> getOpinion(int id) {
        return opinionsDAO.findById(id);
    }
}
