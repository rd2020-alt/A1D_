package com.certus.A1D.Services;

import com.certus.A1D.Entity.ComprobanteEntity;
import java.util.List;
import java.util.Optional;


public interface ComprobanteService {
            // Mostrar todos los registros 
    List<ComprobanteEntity> findALL();
    
    //Buscar los registros por código
    Optional<ComprobanteEntity> findById(Long Id);
    
    //Mostrar todos los registros habilitados (estad=true)
    List<ComprobanteEntity>  findAllCustom();
    
    //Agregar Registro
    ComprobanteEntity add (ComprobanteEntity c);
    
    //Actualizar Registro
     ComprobanteEntity update(ComprobanteEntity c);
             
    //Eliminar Registro
     ComprobanteEntity delete (ComprobanteEntity c);
    
}
