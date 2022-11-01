package com.example.Remington.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Salon")

public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idSalon;
    @Column(nullable = false ,length = 245)
    private int codigo;
    @Column(nullable = false ,length = 245)
    private String descripcion;
    @Column(nullable = false ,length = 245)
    private String estado;   
}
