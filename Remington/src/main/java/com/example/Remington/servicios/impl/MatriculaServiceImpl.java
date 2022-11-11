package com.example.Remington.servicios.impl;

import com.example.Remington.model.Horario;
import com.example.Remington.model.Matricula;
import com.example.Remington.repository.HorarioRepository;
import com.example.Remington.repository.MatriculaRepository;
import com.example.Remington.servicios.HorarioService;
import com.example.Remington.servicios.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl  implements MatriculaService {


    @Autowired
    private MatriculaRepository matriculaRepository;



    @Override
    public Matricula saveMatricula(Matricula matricula) {
        return matriculaRepository.save(matricula );
    }

    @Override
    public List<Matricula> getAllMatricula() {
        return (List<Matricula>) matriculaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        matriculaRepository.deleteById(id);

    }

    @Override
    public Matricula findById(Integer id) {
        return matriculaRepository.findById(id).orElse(null);

    }
}
