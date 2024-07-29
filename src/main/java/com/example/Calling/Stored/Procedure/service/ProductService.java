package com.example.Calling.Stored.Procedure.service;

import com.example.Calling.Stored.Procedure.entity.Product;
import com.example.Calling.Stored.Procedure.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void saveOrUpdate(Product product)
    {
        productRepository.save(product);
    }

    public void updateProduct(Product product){
        productRepository.save(product);
    }

    public Product getProductById(int pId)
    {
        return productRepository.findById(pId).get();
    }

    public void deleteProductById(int pId){
        productRepository.deleteById(pId);

    }

    @Transactional
    public List<Product> getProductsWithPagination(int offset, int pageSize) {
        return productRepository.getProductsWithPagination(offset, pageSize);
    }
}
