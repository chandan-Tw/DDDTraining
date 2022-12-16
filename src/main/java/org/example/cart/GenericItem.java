package org.example.cart;

import java.util.Objects;

public class GenericItem implements Item{
    private final String name;
    private final Integer quantity;
    private final Price unitPrice;
    public GenericItem(String name, Integer quantity, Price unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override

    public String name() {
        return name;
    }

    @Override
    public Price price() {
        return new Price(unitPrice.getAmount() * quantity, unitPrice.getCurrency());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem that = (GenericItem) o;
        return Objects.equals(name, that.name) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + price() +
                "}\n";
    }

}
