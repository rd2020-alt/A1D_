package com.certus.A1D.Services;

import com.certus.A1D.Entity.PersonaEntity;
import com.certus.A1D.Repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class PersonaServiceImp implements PersonaService {

    @Autowired
    private PersonaRepository personarepositorio;

    @Override
    public List<PersonaEntity> findALL() {
        return personarepositorio.findAll();
    }

    @Override
    public Optional<PersonaEntity> findById(Long Id) {
        return personarepositorio.findById(Id);
    }

    @Override
    public List<PersonaEntity> findAllCustom() {
        return personarepositorio.findAllCustom();
    }

    @Override
    public PersonaEntity add(PersonaEntity c) {
        return personarepositorio.save(c);
    }

    @Override
    public PersonaEntity update(PersonaEntity c) {
        PersonaEntity objPersona = personarepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objPersona);
        return personarepositorio.save(c);
    }

    @Override
    public PersonaEntity delete(PersonaEntity c) {
        PersonaEntity objPersona = personarepositorio.getById(c.getId());
        objPersona.setEstado(0);
        return personarepositorio.save(objPersona);
    }

}

