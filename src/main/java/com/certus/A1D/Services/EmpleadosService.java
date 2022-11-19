package com.certus.A1D.Services;

import com.certus.A1D.Entity.EmpleadosEntity;
import java.util.List;
import java.util.Optional;

public interface EmpleadosService {
            // Mostrar todos los registros 
    List<EmpleadosEntity> findALL();
    
    //Buscar los registros por código
    Optional<EmpleadosEntity> findById(Long Id);
    
    //Mostrar todos los registros habilitados (estad=true)
    List<EmpleadosEntity>  findAllCustom();
    
    //Agregar Registro
    EmpleadosEntity add (EmpleadosEntity c);
    
    //Actualizar Registro
     EmpleadosEntity update(EmpleadosEntity c);
             
    //Eliminar Registro
     EmpleadosEntity delete (EmpleadosEntity c);
    
}
