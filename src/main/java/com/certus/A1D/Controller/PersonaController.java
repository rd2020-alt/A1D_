package com.certus.A1D.Controller;


import com.certus.A1D.Entity.PersonaEntity;
import com.certus.A1D.Services.PersonaService;
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
@RequestMapping("/Persona")
public class PersonaController {
   //El controlador va al REQUEST
    @Autowired
    private PersonaService personaservice;
    
    @GetMapping
    public List<PersonaEntity> findALL(){
        return personaservice.findALL();
    }
    
    @GetMapping("/Custom")
    public List<PersonaEntity> findAllCustom(){
        return personaservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<PersonaEntity> findById(@PathVariable Long id){
        return personaservice.findById(id);
    }
    
    @PostMapping
    public PersonaEntity add (@RequestBody PersonaEntity c){
        return personaservice.add(c);
    }
    
    @PutMapping("/{id}")
    public PersonaEntity update(@PathVariable Long id, @RequestBody PersonaEntity c) {
        c.setId(id);
        return personaservice.update(c);
    }
    
      @DeleteMapping("/{id}")
    public PersonaEntity delete (@PathVariable Long id){
        PersonaEntity objPersona=new PersonaEntity();
        objPersona.setEstado(0);
        return personaservice.delete(PersonaEntity.builder().id(id).build());
    }
    }
