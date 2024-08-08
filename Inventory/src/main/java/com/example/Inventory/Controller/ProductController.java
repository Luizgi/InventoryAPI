package com.example.Inventory.Controller;

import com.example.Inventory.Model.Product;
import com.example.Inventory.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }

    @GetMapping
    public List<Product> listProducts()
    {
        return productService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> searchProduct(@PathVariable Long id)
    {
        Optional<Product> product = productService.getById(id);

        if(product.isPresent())
        {
            return ResponseEntity.ok(product.get());
        } else {
          return  ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id)
    {
        productService.removeProduct(id);
        return ResponseEntity.noContent().build();
    }
}
