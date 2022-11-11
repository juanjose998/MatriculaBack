package com.example.Remington.servicios.impl;

import com.example.Remington.model.Matricula;
import com.example.Remington.model.Programa;
import com.example.Remington.repository.MatriculaRepository;
import com.example.Remington.repository.ProgramaRepository;
import com.example.Remington.servicios.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgramaServiceImpl implements ProgramaService {


    @Autowired
    private ProgramaRepository programaRepository;


    @Override
    public Programa savePrograma(Programa programa)  {
        return programaRepository.save(programa );
    }

    @Override
    public List<Programa> getAllPrograma() {
        return (List<Programa>) programaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        programaRepository.deleteById(id);

    }

    @Override
    public Programa findById(Integer id) {
        return programaRepository.findById(id).orElse(null);
    }
}
