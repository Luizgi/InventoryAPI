package com.example.Inventory.Service;

import com.example.Inventory.Model.Product;
import com.example.Inventory.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    public List<Product> listAll()
    {
        return productRepository.findAll();
    }

    public Optional<Product> getById(Long id)
    {
        return productRepository.findById(id);
    }

    public void removeProduct(Long id)
    {
        productRepository.deleteById(id);
    }
}
