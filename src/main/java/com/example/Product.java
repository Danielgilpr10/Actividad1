package com.example;

public class Product {

    private String brand;
    private String model;
    private double price;
    private int year;
    private int stock;

    // Getter de brand
    public String getBrand() {
        return brand;
    }

    // Setter de brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter de model
    public String getModel() {
        return model;
    }

    // Setter de modelo (model)
    public void setModel(String model) {
        this.model = model;
    }

    // Getter de precio (price)
    public double getPrice() {
        return price;
    }

    // Setter de precio (price)
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter de año (Year)
    public double getYear() {
        return year;
    }

    // Setter de year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter de stock
    public int getStock() {
        return stock;
    }

    // Setter de stock
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return String.format(
                "Car [Brand: %s, Model: %s, Price:   %.2f, Year: %d, Stock: %d]",
                brand, model, price, year, stock);
    }

}