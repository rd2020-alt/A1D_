package com.certus.A1D.Repository;

import com.certus.A1D.Entity.PedidoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

    @Query("select c from PedidoEntity c where c.estado='1'")
    List<PedidoEntity> findAllCustom();

}
