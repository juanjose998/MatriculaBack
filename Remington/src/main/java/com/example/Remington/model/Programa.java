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
@Table(name = "Programa")

public class Programa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idPrograma;
    @Column(nullable = false ,length = 245)
    private String nombre;
    @Column(nullable = false ,length = 245)
    private int codigo;
    @Column(nullable = false ,length = 245)
    private String descripcion;
    @Column(nullable = false ,length = 245)
    private Integer credito;
    @Column(nullable = false ,length = 245)
    private String jornada;   
}
