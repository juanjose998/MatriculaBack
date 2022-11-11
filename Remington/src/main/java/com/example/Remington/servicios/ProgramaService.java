package com.example.Remington.servicios;

import com.example.Remington.model.Matricula;
import com.example.Remington.model.Programa;

import java.util.List;

public interface ProgramaService {


    public Programa savePrograma(Programa programa);
    public List<Programa> getAllPrograma();
    public void delete(Integer id);
    public Programa findById(Integer id);

}
