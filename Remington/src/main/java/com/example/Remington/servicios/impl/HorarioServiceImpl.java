package com.example.Remington.servicios.impl;


import com.example.Remington.model.Estudiante;
import com.example.Remington.model.Horario;
import com.example.Remington.repository.EstudianteRepository;
import com.example.Remington.repository.HorarioRepository;
import com.example.Remington.servicios.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HorarioServiceImpl  implements HorarioService {


    @Autowired
    private HorarioRepository horarioRepository;


    @Override
    public Horario saveHorario(Horario horario) {
        return horarioRepository.save(horario );

    }

    @Override
    public List<Horario> getAllHorario() {
        return (List<Horario>) horarioRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        horarioRepository.deleteById(id);

    }

    @Override
    public Horario findById(Integer id) {
        return horarioRepository.findById(id).orElse(null);
    }
}
