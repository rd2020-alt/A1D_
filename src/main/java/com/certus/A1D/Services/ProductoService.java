package com.certus.A1D.Services;

import com.certus.A1D.Entity.ProductoEntity;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    // Mostrar todos los registros 

    List<ProductoEntity> findALL();

    //Buscar los registros por código
    Optional<ProductoEntity> findById(Long Id);

    //Mostrar todos los registros habilitados (estad=true)
    List<ProductoEntity> findAllCustom();

    //Agregar Registro
    ProductoEntity add(ProductoEntity c);

    //Actualizar Registro
    ProductoEntity update(ProductoEntity c);

    //Eliminar Registro
    ProductoEntity delete(ProductoEntity c);

}
