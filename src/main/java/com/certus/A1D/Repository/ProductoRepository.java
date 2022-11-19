package com.certus.A1D.Repository;

import com.certus.A1D.Entity.ProductoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

    @Query("select c from ProductoEntity c where c.estado='1'")
    List<ProductoEntity> findAllCustom();

}
