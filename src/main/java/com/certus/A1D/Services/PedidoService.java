package com.certus.A1D.Services;

import com.certus.A1D.Entity.PedidoEntity;
import java.util.List;
import java.util.Optional;

public interface PedidoService {
    // Mostrar todos los registros 

    List<PedidoEntity> findALL();

    //Buscar los registros por código
    Optional<PedidoEntity> findById(Long Id);

    //Mostrar todos los registros habilitados (estad=true)
    List<PedidoEntity> findAllCustom();

    //Agregar Registro
    PedidoEntity add(PedidoEntity c);

    //Actualizar Registro
    PedidoEntity update(PedidoEntity c);

    //Eliminar Registro
    PedidoEntity delete(PedidoEntity c);

}
