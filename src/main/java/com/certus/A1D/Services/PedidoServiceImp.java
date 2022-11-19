package com.certus.A1D.Services;

import com.certus.A1D.Entity.PedidoEntity;
import com.certus.A1D.Repository.PedidoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

 public class PedidoServiceImp implements PedidoService {

    @Autowired
    private PedidoRepository pedidorepositorio;

    @Override
    public List<PedidoEntity> findALL() {
        return pedidorepositorio.findAll();
    }

    @Override
    public Optional<PedidoEntity> findById(Long Id) {
        return pedidorepositorio.findById(Id);
    }

    @Override
    public List<PedidoEntity> findAllCustom() {
        return pedidorepositorio.findAllCustom();
    }

    @Override
    public PedidoEntity add(PedidoEntity c) {
        return pedidorepositorio.save(c);
    }

    @Override
    public PedidoEntity update(PedidoEntity c) {
        PedidoEntity objPedido = pedidorepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objPedido);
        return pedidorepositorio.save(c);
    }

    @Override
    public PedidoEntity delete(PedidoEntity c) {
        PedidoEntity objPedido = pedidorepositorio.getById(c.getId());
        objPedido.setEstado(0);
        return pedidorepositorio.save(objPedido);
    }

}