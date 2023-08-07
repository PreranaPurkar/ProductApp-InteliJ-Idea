package com.technospace.productinventory.service.impl;

import com.technospace.productinventory.entity.ProductEntity;
import com.technospace.productinventory.model.ProductModel;
import com.technospace.productinventory.repo.ProductRepo;
import com.technospace.productinventory.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements IProductService {
    @Autowired
    ProductRepo productRepo;

    @java.lang.Override
    public ProductEntity addProduct(ProductModel productModel) {
        ProductEntity productEntity = new ProductEntity(productModel);
        productRepo.save(productEntity);
        return productRepo.save(productEntity);
    }

    @java.lang.Override
    public List<ProductEntity> getAllProducts() {
        return productRepo.findAll();
    }

    @java.lang.Override
    public String updateProduct(Integer id,ProductModel productModel) {
        ProductEntity productEntity = getProductById(id);
        if (productEntity != null) {
            productEntity.setName(productModel.getName());
            productEntity.setDescription(productModel.getDescription());
            productEntity.setQty(productModel.getQty());
            productEntity.setPrice(productModel.getPrice());
            productEntity.setStatus(productModel.getStatus());
            productRepo.save(productEntity);
            return "Product is Updated";
        } else {
            return "Product is not Available ";
        }
    }

    @java.lang.Override
    public String deleteProduct(Integer id) {
        ProductEntity productEntity = getProductById(id);
        if (productEntity != null) {
            productRepo.delete(productEntity);
            return "Product is Deleted";
        }
        else{
            return "Product is not Available ";
        }
    }

    @java.lang.Override
    public ProductEntity getProductById(Integer id) {
        return productRepo.findById(id).get();
    }
}
