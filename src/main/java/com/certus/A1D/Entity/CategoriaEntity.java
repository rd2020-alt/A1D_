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

@Builder
/*instanciar.crear y construir clases*/
@AllArgsConstructor
/*permite crear el constructor con parametros*/
@NoArgsConstructor
/*sin parametros*/
@Data
/*permite generar los metodos set y get*/

@Entity(name = "CategoriaEntity")/*Definir lal entidad con la cual se va a trabajar*/
@Table(name = "categoria")/*definir la tabla con la cual se va a trabajar*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CategoriaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "comida")
    private String comida;

    @Column(name = "calzados")
    private String calzados;

    @Column(name = "ropa")
    private String ropa;

    @Column(name = "jugueteria")
    private String jugueteria;

    @Column(name = "GYM")
    private String GYM;

    @Column(name = "boleteria")
    private String boleteria;
    @Column(name = "estado")
    private int estado;
    
   // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
}
//id int auto_increment PRIMARY KEY NOT NULL,
//comida varchar(30),
//calzados varchar(30),
//ropa varchar(30),
//jugueteria varchar(30),
//GYM varchar(30),
//boleteria varchar(30)

