package com.technospace.productinventory.repo;

import com.technospace.productinventory.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Ejb3TransactionAnnotationParser;
@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
