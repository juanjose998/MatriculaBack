package com.example.Remington.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Remington.model.Estudiante;
import com.example.Remington.servicios.EstudianteService;

@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins = "http://localhost:4200")

public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/crear")
    public Estudiante add(@RequestBody Estudiante estudiante){

        return estudianteService.saveEstudiante(estudiante);
    }

    @GetMapping("/listarEstudiantes")
    public List<Estudiante> getAllEstudiantes(){
        return estudianteService.getAllEstudiantes();
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id){
        estudianteService.delete(id);
    }


    @PutMapping("/actualizar/{id}")
    public Estudiante actualizar(@RequestBody Estudiante estudiante ,@PathVariable Integer id){
        Estudiante estudianteActual = estudianteService.findById(id);
        estudianteActual.setPrimer_nombre(estudiante.getPrimer_nombre());
        estudianteActual.setSegundo_nombre(estudiante.getSegundo_nombre());
        estudianteActual.setPrimer_apellido(estudiante.getPrimer_apellido());
        estudianteActual.setSegundo_apellido(estudiante.getSegundo_apellido());
        estudianteActual.setNumIdentificacion(estudiante.getNumIdentificacion());
        estudianteActual.setTipoIdentificacion(estudiante.getTipoIdentificacion());
        estudianteActual.setEstado_academico(estudiante.getEstado_academico());
        estudianteActual.setEstado_matricula(estudiante.getEstado_matricula());
        estudianteActual.setPrograma(estudiante.getPrograma());
        estudianteActual.setJornada(estudiante.getJornada());
        estudianteActual.setTelefono(estudiante.getTelefono());
        estudianteActual.setCorreoElectronico(estudiante.getCorreoElectronico());
        return estudianteService.saveEstudiante(estudianteActual);

    }


    @GetMapping("/{id}")
    public Estudiante obtenerEstudiantePorId(@PathVariable Integer id){
        return estudianteService.findById(id);

    }
}
