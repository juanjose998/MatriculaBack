package com.example.Remington.servicios;

import com.example.Remington.model.Programa;
import com.example.Remington.model.Salon;

import java.util.List;

public interface SalonService {



    public Salon saveSalon(Salon salon);
    public List<Salon> getAllSalon();
    public void delete(Integer id);
    public Salon findById(Integer id);

}
