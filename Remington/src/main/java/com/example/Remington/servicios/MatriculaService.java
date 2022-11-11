package com.example.Remington.servicios;

import com.example.Remington.model.Matricula;

import java.util.List;

public interface MatriculaService {

    public Matricula saveMatricula(Matricula matricula);
    public List<Matricula> getAllMatricula();
    public void delete(Integer id);
    public Matricula findById(Integer id);

}
