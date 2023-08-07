package com.technospace.productinventory.entity;

import com.technospace.productinventory.model.ProductModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@NoArgsConstructor
@Entity
@Table(name= "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Integer qty;
    private Integer Price;
    private String status;

    public ProductEntity(ProductModel productModel) {
        this.name = productModel.getName();
        this.description = productModel.getDescription();
        this.qty = productModel.getQty();
        this.Price = productModel.getPrice();
        this.status = productModel.getStatus();
    }
}
