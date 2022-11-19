package com.certus.A1D.Controller;

import com.certus.A1D.Entity.ComprobanteEntity;
import com.certus.A1D.Services.ComprobanteService;
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
@RequestMapping("/Comprobante")
public class ComprobanteController {
   //El controlador va al REQUEST
    @Autowired
    private ComprobanteService comprobanteservice;
    
    @GetMapping
    public List<ComprobanteEntity> findAll(){
        return comprobanteservice.findALL();
    }
    
    @GetMapping("/Custom")
    public List<ComprobanteEntity> findAllCustom(){
        return comprobanteservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ComprobanteEntity> findById(@PathVariable Long id){
        return comprobanteservice.findById(id);
    }
    
    @PostMapping
    public ComprobanteEntity add (@RequestBody ComprobanteEntity c){
        return comprobanteservice.add(c);
    }
    
    @PutMapping("/{id}")
    public ComprobanteEntity update(@PathVariable Long id, @RequestBody ComprobanteEntity c) {
        c.setId(id);
        return comprobanteservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ComprobanteEntity delete(@PathVariable Long id) {
       ComprobanteEntity objComprobante= new ComprobanteEntity();
       objComprobante.setEstado(0);
       return comprobanteservice.delete(ComprobanteEntity.builder().id(id).build());
    }
  }
