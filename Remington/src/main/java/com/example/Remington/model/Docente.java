package com.example.Remington.model;

import java.io.Serializable;

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
@Table(name = "Docente")

public class Docente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idDocente;
    @Column(nullable = false ,length = 245)
    private String nombre;
    @Column(nullable = false ,length = 245)
    private String apellido;
    @Column(nullable = false ,length = 100)
    private Integer numIdentificacion;
    @Column(nullable = false ,length = 100)
    private String tipoIdentificacion;
    @Column(nullable = false ,length = 245)
    private String correoElectronico;
    @Column(nullable = false ,length = 50)
    private Integer telefono;   
}
