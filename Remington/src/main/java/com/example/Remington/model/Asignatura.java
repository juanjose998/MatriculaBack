package com.example.Remington.model;
import javax.persistence.*;

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
    private String codigo;
    private String nombre;;
    private String descripcion;
    private Integer creditos;
    private String pre_requisito;
    @ManyToOne
    @JoinColumn(name="id_Docente")
    private Docente docente;
}

