package com.example.Calling.Stored.Procedure.controller;

import com.example.Calling.Stored.Procedure.entity.Product;
import com.example.Calling.Stored.Procedure.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    private Product saveBook(@RequestBody Product product)
    {
        productService.saveOrUpdate(product);
        return product;
    }

    @PutMapping("/update")
    private Product update(@RequestBody Product product){
        productService.updateProduct(product);
        return product;
    }
    @GetMapping("/getById/{pid}")
    public Product getProduct(@PathVariable("pid") int pId) {
        return productService.getProductById(pId);
    }
    @DeleteMapping("/deleteById/{pid}")
    public void deleteProduct(@PathVariable("pid") int pId){
        productService.deleteProductById(pId);
    }
    @GetMapping("/products")
    public List<Product> getProductsWithPagination(
            @RequestParam(defaultValue = "0") int offset,
            @RequestParam(defaultValue = "10") int pageSize) {
        return productService.getProductsWithPagination(offset, pageSize);
    }

}
