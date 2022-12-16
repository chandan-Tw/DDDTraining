package org.example.cart;

import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private final List<Product> productList;

    public Order(List<Item> itemList) {
      this.productList = itemList.stream().map(item -> new Product(item.name(),item.price()))
              .collect(Collectors.toList());
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }
}
