package org.example.cart;

import java.util.*;

public class Cart {
    private final List<Item> itemList;
    private static final Set<String> removedItems=new HashSet<>();

    private boolean isCheckedOut;

    public  void add(Item item){
        itemList.add(item);
    }
    public void remove(Item item){
        itemList.remove(item);
        removedItems.add(item.name());
    }

    public Cart() {
        this.itemList = new ArrayList<>();
    }
    public void print(){
        System.out.println("Items in the cart : "+itemList.toString());
    }

    public void printRemovedItems(){

        System.out.println("Removed Cart Item : "+removedItems.toString());
    }

    @Override
    public boolean equals(Object o) {
        return this==o;

    }

    @Override
    public int hashCode() {
        return Objects.hash(itemList);
    }
    public Order checkOut(){
        isCheckedOut=true;
        return new Order(itemList);
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }
}
