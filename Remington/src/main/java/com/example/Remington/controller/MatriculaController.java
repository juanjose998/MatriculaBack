package com.example.Remington.controller;

import com.example.Remington.model.Horario;
import com.example.Remington.model.Matricula;
import com.example.Remington.servicios.HorarioService;
import com.example.Remington.servicios.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/matricula")
public class MatriculaController {


    @Autowired
    private MatriculaService matriculaService;


    @PostMapping("/add")
    public Matricula add(@RequestBody Matricula matricula){
        return matriculaService.saveMatricula(matricula);
    }


    @GetMapping("/listarMatriculas")
    public List<Matricula> getMatriculas(){
        return matriculaService.getAllMatricula();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        matriculaService.delete(id);
    }

    @PutMapping("/actualizar/{id}")
    public Matricula actualizar(@RequestBody Matricula matricula , @PathVariable Integer id){
        Matricula matriculaActual = matriculaService.findById(id);
        matriculaActual.setCantidadCreditos(matricula.getCantidadCreditos());
        matriculaActual.setFecha_matricula(matricula.getFecha_matricula());
        matriculaActual.setSemestre(matricula.getSemestre());
        matriculaActual.setAsignatura(matricula.getAsignatura());
        matriculaActual.setEstudiante(matricula.getEstudiante());
        matriculaActual.setHorario(matricula.getHorario());

        return matriculaService.saveMatricula(matriculaActual);

    }

    @GetMapping("/{id}")
    public Matricula
    obtenerMatriculasPorId(@PathVariable Integer id){
        return  matriculaService.findById(id);
    }


}
