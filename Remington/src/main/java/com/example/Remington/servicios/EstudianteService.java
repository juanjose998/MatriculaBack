package com.example.Remington.servicios;

import java.util.List;
import com.example.Remington.model.Estudiante;

public interface EstudianteService {

    public Estudiante saveEstudiante(Estudiante estudiante);
    public List<Estudiante>getAllEstudiantes();
    public void delete(Integer id);
    public Estudiante findById(Integer id);

}   
