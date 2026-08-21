package com.example;

public class Main {

    public static void main(String[] args) {

        // Primer coche
        Car carro = new Car();

        carro.setBrand("Mazda");
        carro.setModel("CX-30");
        carro.setPrice(120000000);
        carro.setYear(2025);
        carro.setStock(20);

        // Segundo coche
        Car carro2 = new Car();

        carro2.setBrand("Toyota");
        carro2.setModel("Corolla");
        carro2.setPrice(80000000);
        carro2.setYear(2024);
        carro2.setStock(15);

        // Datos primer carro con getters
        System.out.println("Primer Carro");
        System.out.println("Marca: " + carro.getBrand());
        System.out.println("Modelo: " + carro.getModel());
        System.out.printf("Precio: %.2f%n", carro.getPrice());
        System.out.println("Año: " + carro.getYear());
        System.out.println("Stock actual: " + carro.getStock());

        System.out.println();

        // Datos segundo carro con getters
        System.out.println("Segundo Carro");
        System.out.println("Marca: " + carro2.getBrand());
        System.out.println("Modelo: " + carro2.getModel());
        System.out.printf("Precio: %.2f%n", carro2.getPrice());
        System.out.println("Año: " + carro2.getYear());
        System.out.println("Stock actual: " + carro2.getStock());
        System.out.println();
        System.out.println(carro);
        System.out.println(carro2);
    }
}