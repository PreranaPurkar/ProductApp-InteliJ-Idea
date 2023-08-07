package com.technospace.productinventory.controller;

import com.technospace.productinventory.entity.ProductEntity;
import com.technospace.productinventory.model.ProductModel;
import com.technospace.productinventory.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/api")
public class ProductController {
@Autowired
    IProductService iProductService;
@PostMapping("/addproduct")
    public ProductEntity addProduct(@RequestBody ProductModel productModel){
        return iProductService.addProduct(productModel);
    }

    @GetMapping("/getallproducts")
    public List<ProductEntity> getAllProducts(){
    return iProductService.getAllProducts();
    }

    @GetMapping("/getproductbyid/{id}")
    public ProductEntity getProductById(@PathVariable("id") Integer id){
    return iProductService.getProductById(id);
    }

    @GetMapping("/updateproduct/{id}")
    public String updateProduct(@PathVariable("id") Integer id,@RequestBody ProductModel productModel){
    return iProductService.updateProduct(id,productModel);
    }

    @GetMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable("id")Integer id){
    return iProductService.deleteProduct(id);
    }
}
