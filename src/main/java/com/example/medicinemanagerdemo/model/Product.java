package com.example.medicinemanagerdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
        @Id
        @Column(name = "ProductID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int ProductID;
        @Column(name = "ProductName")
        private String ProductName;
        @Column(name = "Category")
        private int Category;
        @Column(name = "ProductUnit")
        private String ProductUnit;
    @Column(name = "Price")
    private Float Price;
    @Column(name = "Description")
    private String Description;
    @Column(name = "State")
    private int State;

//    public Product(int productID, String productName, int category, String productUnit, Float price, String description, int state) {
//        ProductID = productID;
//        ProductName = productName;
//        Category = category;
//        ProductUnit = productUnit;
//        Price = price;
//        Description = description;
//        State = state;
//    }

    public int getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int category) {
        Category = category;
    }

    public String getProductUnit() {
        return ProductUnit;
    }

    public void setProductUnit(String productUnit) {
        ProductUnit = productUnit;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }
}
