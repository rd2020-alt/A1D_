package com.certus.A1D.Services;

import com.certus.A1D.Entity.CategoriaEntity;
import com.certus.A1D.Repository.CategoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoriaServiceImp implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriarepositorio;

    @Override
    public List<CategoriaEntity> findALL() {
        return categoriarepositorio.findAll();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long Id) {
        return categoriarepositorio.findById(Id);
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return categoriarepositorio.findAllCustom();
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return categoriarepositorio.save(c);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objCategoria = categoriarepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objCategoria);
        return categoriarepositorio.save(c);    
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objCategoria = categoriarepositorio.getById(c.getId());
        objCategoria.setEstado(0);
        return categoriarepositorio.save(objCategoria);
    }
    
}
