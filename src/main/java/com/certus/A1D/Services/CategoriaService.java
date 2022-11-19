package com.certus.A1D.Services;

import com.certus.A1D.Entity.CategoriaEntity;
import java.util.List;
import java.util.Optional;


public interface CategoriaService {
        // Mostrar todos los registros 
    public List<CategoriaEntity> findALL();
    
    //Buscar los registros por código
    public Optional<CategoriaEntity> findById(Long Id);
    
    //Mostrar todos los registros habilitados (estad=true)
    public List<CategoriaEntity>  findAllCustom();
    
    //Agregar Registro
    public CategoriaEntity add (CategoriaEntity c);
    
    //Actualizar Registro
    public CategoriaEntity update(CategoriaEntity c);
             
    //Eliminar Registro
     public CategoriaEntity delete (CategoriaEntity c);
    
}
