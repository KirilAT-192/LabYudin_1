package com.company;

import java.time.LocalDateTime;
import java.util.Random;

public class Product {
    private int number;
    private int price;
    private int year;
    String manufacturer;

    public Product(int number, int price, int year, String manufacturer) {
        this.number = number;
        this.setPrice(price);
        this.setYear(year);
        this.manufacturer = manufacturer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    ;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= LocalDateTime.now().getYear())
            this.year = year;
        else this.year = LocalDateTime.now().getYear();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static Product generate() {
        Random r = new Random();
        return new Product(r.nextInt(500) + 1, r.nextInt(5000) - 2000, r.nextInt(3) + 2018,
                Dictionary.getManufacturers()[r.nextInt(Dictionary.getManufacturers().length)]);
    }

    @Override
    public String toString() {
        return "\n\nПродукт{\n" +
                "\nКоличество: " + number +
                "\nЦена: " + price +
                "\nГод производства: " + year +
                "\nПроизводитель: " + manufacturer +
                "\n}";
    }
}