package com.certus.A1D.Services;

import com.certus.A1D.Entity.EmpleadosEntity;
import com.certus.A1D.Repository.EmpleadosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpleadosServiceImp implements EmpleadosService {

    @Autowired
    private EmpleadosRepository empleadosrepositorio;

    @Override
    public List<EmpleadosEntity> findALL() {
        return empleadosrepositorio.findAll();
    }

    @Override
    public Optional<EmpleadosEntity> findById(Long Id) {
        return empleadosrepositorio.findById(Id);
    }

    @Override
    public List<EmpleadosEntity> findAllCustom() {
        return empleadosrepositorio.findAllCustom();
    }

    @Override
    public EmpleadosEntity add(EmpleadosEntity c) {
        return empleadosrepositorio.save(c);
    }

    @Override
    public EmpleadosEntity update(EmpleadosEntity c) {
        EmpleadosEntity objEmpleados = empleadosrepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objEmpleados);
        return empleadosrepositorio.save(c);
    }

    @Override
    public EmpleadosEntity delete(EmpleadosEntity c) {
        EmpleadosEntity objEmpleados = empleadosrepositorio.getById(c.getId());
        objEmpleados.setEstado(0);
        return empleadosrepositorio.save(objEmpleados);
    }

}
