package com.example.Remington.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "Matricula")

public class Matricula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idMatricula;
    private Date fecha_matricula;
    private int semestre;
    private int cantidadCreditos;
    @ManyToOne
    @JoinColumn(name="id_asignatura")
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name="id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name="id_horario")
    private Horario horario;


    private static final long serialVersionUID =1L;
}
