package com.example.Remington.controller;

import com.example.Remington.model.Matricula;
import com.example.Remington.model.Salon;
import com.example.Remington.servicios.MatriculaService;
import com.example.Remington.servicios.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/salon")
public class SalonController {
    @Autowired
    private SalonService salonService;


    @PostMapping("/add")
    public Salon add(@RequestBody Salon salon){
        return salonService.saveSalon(salon);
    }


    @GetMapping("/listarSalones")
    public List<Salon> getSalones(){
        return salonService.getAllSalon();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        salonService.delete(id);
    }

    @PutMapping("/actualizar/{id}")
    public Salon actualizar(@RequestBody Salon salon , @PathVariable Integer id){
        Salon salonActual = salonService.findById(id);
        salonActual.setCodigo(salon.getCodigo());
        salonActual.setDescripcion(salon.getDescripcion());
        salonActual.setEstado_salon(salon.getEstado_salon());

        return salonService.saveSalon(salonActual);

    }

    @GetMapping("/{id}")
    public Salon
    obtenerSalonesPorId(@PathVariable Integer id){
        return  salonService.findById(id);
    }


}
