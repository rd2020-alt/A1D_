package com.certus.A1D.Repository;

import com.certus.A1D.Entity.EmpleadosEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmpleadosRepository extends JpaRepository<EmpleadosEntity , Long>{
    @Query("select c from EmpleadosEntity c where c.estado='1'")
    List<EmpleadosEntity> findAllCustom();
    
}
