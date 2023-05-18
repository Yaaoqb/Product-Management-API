package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    // Save a product
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    // Save multiple products
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }
    // Get all products
    public List<Product> getProducts() {
        return repository.findAll();
    }
    // Get a product by its ID
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
    // Get a product by its name
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }
    // Delete a product by its ID
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
    // Update an existing product
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
