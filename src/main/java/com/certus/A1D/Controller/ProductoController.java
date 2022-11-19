package com.certus.A1D.Controller;



import com.certus.A1D.Entity.ProductoEntity;
import com.certus.A1D.Services.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
    @Autowired
    private ProductoService productoservice;
    
    @GetMapping
    public List<ProductoEntity> findAll(){
        return productoservice.findALL();
    }
    
    @GetMapping("/Custom")
    public List<ProductoEntity> findAllCustom(){
        return productoservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ProductoEntity> findById(@PathVariable Long id){
        return productoservice.findById(id);
    }
    
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity c){
        return productoservice.add(c);
    }
    
    @PutMapping("/{id}")
    public ProductoEntity update (@PathVariable long id,@RequestBody ProductoEntity c){
        c.setId(id);
        return productoservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ProductoEntity delete (@PathVariable long id){
        ProductoEntity objProducto=new ProductoEntity();
        objProducto.setEstado(0);
        return productoservice.delete(ProductoEntity.builder().id(id).build());
    }
}