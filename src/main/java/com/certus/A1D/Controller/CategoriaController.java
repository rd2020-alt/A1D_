package com.certus.A1D.Controller;

import com.certus.A1D.Entity.CategoriaEntity;
import com.certus.A1D.Services.CategoriaService;
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
@RequestMapping("/Categoria")
public class CategoriaController {
   //El controlador va al REQUEST
    @Autowired
    private CategoriaService categoriaservice;
    
    @GetMapping
    public List<CategoriaEntity> findALL(){
        return categoriaservice.findALL();
    }
    
     @GetMapping("/Custom")
    public List<CategoriaEntity> findAllCustom(){
        return categoriaservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<CategoriaEntity> findById(@PathVariable Long id){
        return categoriaservice.findById(id);
    }
    
    @PostMapping
    public CategoriaEntity add (@RequestBody CategoriaEntity c){
        return categoriaservice.add(c);
    }
    
    @PutMapping("/{id}")
    public CategoriaEntity update(@PathVariable long id, @RequestBody CategoriaEntity c) {
        c.setId(id);
        return categoriaservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable long id) {
       CategoriaEntity objCategoria= new CategoriaEntity();
       objCategoria.setEstado(0);
       return categoriaservice.delete(CategoriaEntity.builder().id(id).build());
    }
   }