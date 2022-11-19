package com.certus.A1D.Services;

import com.certus.A1D.Entity.ComprobanteEntity;
import com.certus.A1D.Repository.ComprobanteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ComprobanteServiceImp implements ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanterepositorio;

    @Override
    public List<ComprobanteEntity> findALL() {
        return comprobanterepositorio.findAll();
    }

    @Override
    public Optional<ComprobanteEntity> findById(Long Id) {
        return comprobanterepositorio.findById(Id);
    }

    @Override
    public List<ComprobanteEntity> findAllCustom() {
        return comprobanterepositorio.findAllCustom();
    }

    @Override
    public ComprobanteEntity add(ComprobanteEntity c) {
        return comprobanterepositorio.save(c);
    }

    @Override
    public ComprobanteEntity update(ComprobanteEntity c) {
        ComprobanteEntity objComprobante = comprobanterepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objComprobante);
        return comprobanterepositorio.save(c);
    }

    @Override
    public ComprobanteEntity delete(ComprobanteEntity c) {
        ComprobanteEntity objComprobante = comprobanterepositorio.getById(c.getId());
        objComprobante.setEstado(0);
        return comprobanterepositorio.save(objComprobante);
    }

}
