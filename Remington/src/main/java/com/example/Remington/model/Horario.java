package com.example.Remington.model;
import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Horario")

public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idHorario;
    
    @Column(nullable = false ,length = 245)
    private Date horaInicio;
    @Column(nullable = false ,length = 245)
    private Date horaFinal;
    @Column(nullable = false ,length = 245)
    private String dia;
    @ManyToOne
    @JoinColumn(name="id_salon")
    private Salon salon;
}

