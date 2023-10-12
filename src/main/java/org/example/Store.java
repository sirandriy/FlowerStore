package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> search(String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(product);
            }
        }
        return results;
    }
}
