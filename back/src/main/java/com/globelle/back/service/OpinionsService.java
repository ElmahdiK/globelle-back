package com.globelle.back.service;

import com.globelle.back.dao.OpinionsDAO;
import com.globelle.back.model.Opinions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionsService {

    @Autowired
    private OpinionsDAO opinionsDAO;

    public List<Opinions> getAllOpinions(){
        return (List<Opinions>) opinionsDAO.findAll();
    }
}