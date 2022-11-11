package com.example.Remington.servicios;

import com.example.Remington.model.Docente;
import com.example.Remington.model.Horario;

import java.util.List;

public interface HorarioService {

    public Horario saveHorario(Horario horario);
    public List<Horario> getAllHorario();
    public void delete(Integer id);
    public Horario findById(Integer id);

}
