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

@Entity(name="PedidoEntity")/*Definir lal entidad con la cual se va a trabajar*/
@Table(name="pedido")/*definir la tabla con la cual se va a trabajar*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class PedidoEntity implements Serializable{
    private static final long serialVersionUID= 1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="numpedido")
    private int numbpedido;
    
    @Column(name="fechapedido")
    private String fechapedido;
    
    @Column(name="producto")
    private String producto;
    @Column(name="estado")
    private int estado;
    
//  private ComprobanteEntity comprobante;
}
//id int,
//   numpedido int auto_increment PRIMARY KEY NOT NULL,
//   fechapedido varchar(20),
//   producto varchar(30)
//   comprobante_id INT 



// pedido_has_producto INT
//    pedido_numpedido INT
//    producto_codigo INT