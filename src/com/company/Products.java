package com.company;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products;

    public Products(){
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void remove(Product product) {
        this.products.remove(product);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            products.add(Product.generate());
        }
    }

    public void MaxNumber(){
        int max = 0;
        for (Product product : this.products) {
            if (product.getNumber() > max){
                max = product.getNumber();
            }
        }
        for (Product product : this.products) {
            if (product.getNumber() == max){
                System.out.println("\n\nТовар с наибольшим количеством:\n" + product);
            }
        }
    }

    @Override
    public String toString() {
        return "\n\n\nПродукты" + products + "; ";
    }
}