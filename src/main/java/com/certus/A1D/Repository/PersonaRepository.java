package com.certus.A1D.Repository;

import com.certus.A1D.Entity.PersonaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

    @Query("select c from PersonaEntity c where c.estado='1'")
    List<PersonaEntity> findAllCustom();
    
}
