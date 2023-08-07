package com.technospace.productinventory.service;

import com.technospace.productinventory.entity.ProductEntity;
import com.technospace.productinventory.model.ProductModel;
import java.util.List;
public interface IProductService {
    public ProductEntity addProduct(ProductModel productModel);
    public List<ProductEntity> getAllProducts();
    public String updateProduct(Integer id,ProductModel productModel);
    public String deleteProduct(Integer id);
    public ProductEntity getProductById(Integer id);
}
