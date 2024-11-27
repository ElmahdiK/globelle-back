package com.globelle.back.service;

import com.globelle.back.dao.OpinionsDAO;
import com.globelle.back.model.Opinion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionsService {

    @Autowired
    private OpinionsDAO opinionsDAO;

    public List<Opinion> getAllOpinions(){
        return (List<Opinion>) opinionsDAO.findAll();
    }

    public Optional<Opinion> getOpinion(int id) {
        return opinionsDAO.findById(id);
    }
}
