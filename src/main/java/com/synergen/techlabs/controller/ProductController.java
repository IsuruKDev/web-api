package com.synergen.techlabs.controller;

import com.synergen.techlabs.entity.Product;
import com.synergen.techlabs.repository.ProductRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping(path = "/add")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping(path = "/")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @PutMapping(path = "update")
    public Product updateProduct(@RequestBody Product product) {
        Product p =productRepository.getById(product.getId());
        if (p != null) {
            p.setName(product.getName());
            p.setDescription(product.getDescription());
            return productRepository.save(p);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not Found");
        }

    }

    @DeleteMapping(path = "/remove")
    public String deleteProduct(String productId){
        productRepository.deleteById(productId);
        return "Deleted product Id"+productId;
    }


}
