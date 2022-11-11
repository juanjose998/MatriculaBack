package com.example.Remington.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Remington.model.Docente;
import com.example.Remington.servicios.DocenteService;

@RestController
@RequestMapping("/docente")
@CrossOrigin(origins = "http://localhost:4200")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;


    @PostMapping("/add")
    public Docente add(@RequestBody Docente docente){
        return docenteService.saveDocente(docente);
    }


    @GetMapping("/listarDocentes")
    public List<Docente> getAllDocentes(){
        return docenteService.getAllDocente();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        docenteService.delete(id);
    }

    @PutMapping("/actualizar/{id}")
    public Docente actualizar(@RequestBody Docente docente , @PathVariable Integer id){
        Docente docenteActual = docenteService.findById(id);
        docenteActual.setNombre(docente.getNombre());
        docenteActual.setApellido(docente.getApellido());
        docenteActual.setTipoIdentificacion(docente.getTipoIdentificacion());
        docenteActual.setNumIdentificacion(docente.getNumIdentificacion());
        docenteActual.setTelefono(docente.getTelefono());
        docenteActual.setCorreoElectronico(docente.getCorreoElectronico());

        return docenteService.saveDocente(docenteActual);
        
    }

    @GetMapping("/{id}")
    public Docente obtenerDocentePorId(@PathVariable Integer id){
        return  docenteService.findById(id);
    }


}
