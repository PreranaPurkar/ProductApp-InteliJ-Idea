package com.technospace.productinventory.model;

import lombok.Data;

@Data
public class ProductModel {
    private String name;
    private String description;
    private Integer Price;
    private Integer qty;
    private String status;
}
