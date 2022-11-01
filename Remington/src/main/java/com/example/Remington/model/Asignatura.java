package com.example.Remington.model;
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
@Table(name = "Asignatura")

public class
Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idAsignatura;
    private int codigo;
    private String nombre;;
    private String descripcion;
    private Integer credito;   
}

