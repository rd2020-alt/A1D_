package com.certus.A1D.Controller;


import com.certus.A1D.Entity.EmpleadosEntity;
import com.certus.A1D.Services.EmpleadosService;
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
@RequestMapping("/Empleados")
public class EmpleadosController {
   //El controlador va al REQUEST
    @Autowired
    private EmpleadosService empleadosservice;
    
    @GetMapping
    public List<EmpleadosEntity> findALL(){
        return empleadosservice.findALL();
    }
    
    @GetMapping("/Custom")
    public List<EmpleadosEntity> findAllCustom(){
        return empleadosservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<EmpleadosEntity> findById(@PathVariable Long id){
        return empleadosservice.findById(id);
    }
    
    @PostMapping
    public EmpleadosEntity add (@RequestBody EmpleadosEntity c){
        return empleadosservice.add(c);
    }
    
    @PutMapping("/{id}")
    public EmpleadosEntity update(@PathVariable Long id, @RequestBody EmpleadosEntity c) {
        c.setId(id);
        return empleadosservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public EmpleadosEntity delete(@PathVariable Long id) {
       EmpleadosEntity objEmpleados= new EmpleadosEntity();
       objEmpleados.setEstado(0);
       return empleadosservice.delete(EmpleadosEntity.builder().id(id).build());
    }
    } 