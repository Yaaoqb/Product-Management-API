package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
    // Primary key field
    @Id
    @GeneratedValue
    private int id;
    // Name of the product
    private String name;
    // Quantity of the product
    private int quantity;
    // Price of the product
    private double price;
}
