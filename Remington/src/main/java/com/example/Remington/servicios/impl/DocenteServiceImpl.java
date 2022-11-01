package com.example.Remington.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Remington.model.Docente;
import com.example.Remington.repository.DocenteRepository;
import com.example.Remington.servicios.DocenteService;

@Service
public class DocenteServiceImpl  implements DocenteService{


    @Autowired
    private  DocenteRepository docenteRepository;



    @Override
    public Docente saveDocente(Docente docente) {
        return docenteRepository.save(docente );

    }

    @Override
    public List<Docente> getAllDocente() {
        return (List<Docente>) docenteRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        docenteRepository.deleteById(id);        
        
    }

    @Override
    public Docente findById(Integer id) {
        return docenteRepository.findById(id).orElse(null);
    }
    
}
