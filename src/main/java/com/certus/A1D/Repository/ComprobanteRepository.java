package com.certus.A1D.Repository;

import com.certus.A1D.Entity.ComprobanteEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComprobanteRepository extends JpaRepository<ComprobanteEntity , Long>{
    @Query("select c from ComprobanteEntity c where c.estado='1'")
    List<ComprobanteEntity> findAllCustom();

}


