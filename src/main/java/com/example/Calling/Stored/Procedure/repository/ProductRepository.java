package com.example.Calling.Stored.Procedure.repository;

import com.example.Calling.Stored.Procedure.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Procedure(procedureName = "GetProductsWithPagination")
List<Product> getProductsWithPagination(@Param("Offset") int offset, @Param("PageSize") int pageSize);
}

