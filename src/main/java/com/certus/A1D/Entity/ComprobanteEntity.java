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

@Entity(name="ComprobanteEntity")/*Definir lal entidad con la cual se va a trabajar*/
@Table(name="Comprobante")/*definir la tabla con la cual se va a trabajar*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})


public class ComprobanteEntity implements Serializable{
    /*      static= aunque tenga multiples variable no modifica su valor   */
    private static final long serialVersionUID= 1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="cantidad")
    private int cantidad;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="dni")
    private int dni;
        
    @Column(name="correo")
    private String correo;
    
    @Column(name="total")
    private int total;
    @Column(name="estado")
    private int estado;
//ninguno
}
//id int auto_increment PRIMARY KEY NOT NULL,
//    cantidad int,
//    nombre varchar(50),
//    dni int,
//    proveedor varchar(50),
//    correo varchar(50),
//    total int