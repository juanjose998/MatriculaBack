package com.example.Remington.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Remington.model.Estudiante;
import com.example.Remington.repository.EstudianteRepository;
import com.example.Remington.servicios.EstudianteService;

@Service
public class EstudianteServiceImpl  implements EstudianteService{


    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Estudiante saveEstudiante(Estudiante estudiante) {

        return estudianteRepository.save(estudiante );
    }

    @Override
    public List<Estudiante> getAllEstudiantes() {

        return (List<Estudiante>) estudianteRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        estudianteRepository.deleteById(id);        
    }

    @Override
    public Estudiante findById(Integer id) {


        return estudianteRepository.findById(id).orElse(null);
    }


    
}
