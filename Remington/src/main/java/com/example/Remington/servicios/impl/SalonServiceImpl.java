package com.example.Remington.servicios.impl;

import com.example.Remington.model.Programa;
import com.example.Remington.model.Salon;
import com.example.Remington.repository.ProgramaRepository;
import com.example.Remington.repository.SalonRepository;
import com.example.Remington.servicios.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalonServiceImpl implements SalonService {


    @Autowired
    private SalonRepository salonRepository;


    @Override
    public Salon saveSalon(Salon salon) {
        return salonRepository.save(salon );
    }

    @Override
    public List<Salon> getAllSalon() {
        return (List<Salon>) salonRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        salonRepository.deleteById(id);

    }

    @Override
    public Salon findById(Integer id) {
        return salonRepository.findById(id).orElse(null);
    }
}
