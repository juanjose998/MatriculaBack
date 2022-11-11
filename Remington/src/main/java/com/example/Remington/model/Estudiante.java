package com.example.Remington.model;

import java.io.Serializable;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Estudiante")

public class Estudiante implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  idEstudiante;
    @Column(nullable = false ,length = 245)
    private String primer_nombre;
    @Column(nullable = false ,length = 245)
    private String segundo_nombre;
    @Column(nullable = false ,length = 100)
    private String primer_apellido;
    @Column(nullable = false ,length = 245)
    private String segundo_apellido;
    @Column(nullable = false ,length = 100)
    private Integer numIdentificacion;
    @Column(nullable = false ,length = 100)
    private String tipoIdentificacion;
    @Column(nullable = false ,length = 100)
    private String estado_matricula;
    @ManyToOne
    @JoinColumn(name="id_programa")
    private Programa programa;
    @Column(nullable = false ,length = 100)
    private String correoElectronico;
    @Column(nullable = false ,length = 245)
    private String jornada;
    @Column(nullable = false ,length = 100)
    private Integer telefono;
    @Column(nullable = false ,length = 245)
    private String estado_academico;

    private static final long serialVersionUID= 1L;
}
