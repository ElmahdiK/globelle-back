package com.globelle.back.service;

import com.globelle.back.dao.OpinionDAO;
import com.globelle.back.model.Opinion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionService {

    @Autowired
    private OpinionDAO opinionDAO;

    public List<Opinion> getAllOpinions(){
        return (List<Opinion>) opinionDAO.findAll();
    }

    public Optional<Opinion> getOpinion(int id) {
        return opinionDAO.findById(id);
    }
}
