package com.example.Remington.controller;


import com.example.Remington.model.Docente;
import com.example.Remington.model.Horario;
import com.example.Remington.servicios.DocenteService;
import com.example.Remington.servicios.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horario")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;


    @PostMapping("/add")
    public Horario add(@RequestBody Horario horario){
        return horarioService.saveHorario(horario);
    }


    @GetMapping("/listarHorarios")
    public List<Horario> getAllHorarios(){
        return horarioService.getAllHorario();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        horarioService.delete(id);
    }

    @PutMapping("/actualizar/{id}")
    public Horario actualizar(@RequestBody Horario horario , @PathVariable Integer id){
        Horario horarioActual = horarioService.findById(id);
        horarioActual.setDia(horario.getDia());
        horarioActual.setHoraInicio(horario.getHoraInicio());
        horarioActual.setHoraFinal(horario.getHoraFinal());
        horarioActual.setSalon(horario.getSalon());

        return horarioService.saveHorario(horarioActual);

    }

    @GetMapping("/{id}")
    public Horario obtenerHorarioPorId(@PathVariable Integer id){
        return  horarioService.findById(id);
    }


}
