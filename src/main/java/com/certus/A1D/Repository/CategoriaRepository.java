package com.certus.A1D.Repository;

import com.certus.A1D.Entity.CategoriaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity , Long>{
    @Query("select c from CategoriaEntity c where c.estado='1'")
    List<CategoriaEntity> findAllCustom(); 
    
}
