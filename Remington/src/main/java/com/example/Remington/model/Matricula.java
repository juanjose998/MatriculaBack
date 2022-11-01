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
    private Date fecha;
    private int semestre;
    private int cantidadCredito;
    @ManyToOne
    @JoinColumn(name="matricula_asignada_id")
    private Asignatura asignatura;   

    private static final long serialVersionUID =1L;
}
