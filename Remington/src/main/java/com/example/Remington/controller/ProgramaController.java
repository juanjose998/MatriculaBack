package com.example.Remington.controller;

import com.example.Remington.model.Matricula;
import com.example.Remington.model.Programa;
import com.example.Remington.servicios.MatriculaService;
import com.example.Remington.servicios.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programa")
public class ProgramaController {
    @Autowired
    private ProgramaService programaService;


    @PostMapping("/add")
    public Programa add(@RequestBody Programa programa){
        return programaService.savePrograma(programa);
    }


    @GetMapping("/listarProgramas")
    public List<Programa> getProgramas(){
        return programaService.getAllPrograma();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        programaService.delete(id);
    }

    @PutMapping("/actualizar/{id}")
    public Programa actualizar(@RequestBody Programa programa , @PathVariable Integer id){
        Programa programaActual = programaService.findById(id);
        programaActual.setCodigo(programa.getCodigo());
        programaActual.setCredito(programa.getCredito());
        programaActual.setDescripcion(programa.getDescripcion());
        programaActual.setJornada(programa.getJornada());
        programaActual.setNombre(programa.getNombre());

        return programaService.savePrograma(programaActual);

    }

    @GetMapping("/{id}")
    public Programa
    obtenerProgramasPorId(@PathVariable Integer id){
        return  programaService.findById(id);
    }


}
