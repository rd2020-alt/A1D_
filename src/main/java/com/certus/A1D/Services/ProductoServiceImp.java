package com.certus.A1D.Services;

import com.certus.A1D.Entity.ProductoEntity;
import com.certus.A1D.Repository.ProductoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productorepositorio;

    @Override
    public List<ProductoEntity> findALL() {
        return productorepositorio.findAll();
    }

    @Override
    public Optional<ProductoEntity> findById(Long Id) {
        return productorepositorio.findById(Id);
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return productorepositorio.findAllCustom();
    }

    @Override
    public ProductoEntity add(ProductoEntity c) {
        return productorepositorio.save(c);
    }

    @Override
    public ProductoEntity update(ProductoEntity c) {
        ProductoEntity objProducto = productorepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objProducto);
        return productorepositorio.save(c);
    }

    @Override
    public ProductoEntity delete(ProductoEntity c) {
        ProductoEntity objProducto = productorepositorio.getById(c.getId());
        objProducto.setEstado(0);
        return productorepositorio.save(objProducto);
    }

}
