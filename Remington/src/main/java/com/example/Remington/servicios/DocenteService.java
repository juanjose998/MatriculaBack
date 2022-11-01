package com.example.Remington.servicios;

import java.util.List;

import com.example.Remington.model.Docente;

public interface DocenteService {

    
public Docente saveDocente(Docente docente);
public List<Docente>getAllDocente();
public void delete(Integer id);
public Docente findById(Integer id);

}
