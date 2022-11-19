package com.certus.A1D.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder /*instanciar.crear y construir clases*/
@AllArgsConstructor /*permite crear el constructor con parametros*/
@NoArgsConstructor  /*sin parametros*/
@Data /*permite generar los metodos set y get*/

@Entity(name="EmpleadosEntity")/*Definir lal entidad con la cual se va a trabajar*/
@Table(name="empleados")/*definir la tabla con la cual se va a trabajar*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class EmpleadosEntity implements Serializable{
    /*      static= aunque tenga multiples variable no modifica su valor   */
    private static final long serialVersionUID= 1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="nomemp")
    private String nomEmp;
    
    @Column(name="apeemp")
    private String apeEmp;
    @Column(name="estado")
    private int estado;
    

}
