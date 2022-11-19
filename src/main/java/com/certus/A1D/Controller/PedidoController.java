package com.certus.A1D.Controller;

import com.certus.A1D.Entity.PedidoEntity;
import com.certus.A1D.Services.PedidoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pedido")
public class PedidoController {
   //El controlador va al REQUEST
    @Autowired
    private PedidoService pedidoservice;
    
    @GetMapping
    public List<PedidoEntity> findAll(){
        return pedidoservice.findALL();
    }
    
    @GetMapping("/Custom")
    public List<PedidoEntity> findAllCustom(){
        return pedidoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<PedidoEntity> findById(@PathVariable Long id){
        return pedidoservice.findById(id);
    }
    
    @PostMapping
    public PedidoEntity add (@RequestBody PedidoEntity c){
        return pedidoservice.add(c);
    }
    
    @PutMapping("/{id}")
    public PedidoEntity update(@PathVariable long id, @RequestBody PedidoEntity c) {
        c.setId(id);
        return pedidoservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public PedidoEntity delete(@PathVariable long id) {
       PedidoEntity objPedido= new PedidoEntity();
       objPedido.setEstado(0);
       return pedidoservice.delete(PedidoEntity.builder().id(id).build());
    }
    
}