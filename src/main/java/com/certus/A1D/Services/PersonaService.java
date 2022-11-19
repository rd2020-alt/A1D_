package com.certus.A1D.Services;

import com.certus.A1D.Entity.PersonaEntity;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
    // Mostrar todos los registros 

    List<PersonaEntity> findALL();

    //Buscar los registros por código
    Optional<PersonaEntity> findById(Long Id);

    //Mostrar todos los registros habilitados (estad=true)
    List<PersonaEntity> findAllCustom();

    //Agregar Registro
    PersonaEntity add(PersonaEntity c);

    //Actualizar Registro
    PersonaEntity update(PersonaEntity c);

    //Eliminar Registro
    PersonaEntity delete(PersonaEntity c);

}
