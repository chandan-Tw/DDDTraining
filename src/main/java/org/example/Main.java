package org.example;

import org.example.bankaccount.Account;
import org.example.bankaccount.Address;
import org.example.bankaccount.Customer;
import org.example.cart.*;
import org.example.cart.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> compPriceMap =new HashMap<>();
        double discountRate = 0.9;
        compPriceMap.put("Sony wireless headphones",1000);
        compPriceMap.put("Apple Pencil",2000);

        Cart cart1=new Cart();

        Item applePencil=new GenericItem("Apple Pencil", 2,
                new Price(compPriceMap.get("Apple Pencil")* discountRate, "USD"));
        Item sonyWirelessHeadphone =new GenericItem("Sony wireless headphones", 1,
                new Price(compPriceMap.get("Sony wireless headphones")* discountRate, "USD"));
        cart1.add(applePencil);
        cart1.add(sonyWirelessHeadphone);


        cart1.print();

        if(!cart1.isCheckedOut()) {
            Order order = cart1.checkOut();
            System.out.println(order);
        }
        else{
            System.out.println("Cart is already checked out");
        }


//        cart1.remove(applePencil);
//        cart1.print();
//
//        cart1.printRemovedItems();
//
//        Cart cart2=new Cart();
//        Item sonyWirelessHeadphone2 =new GenericItem("Sony wireless headphones", 1, new Price(compPriceMap.get("Sony wireless headphones")*0.9, "USD"));
//        cart2.add(sonyWirelessHeadphone2);
//        System.out.println(cart1.equals(cart2));


        Address address1=new Address("Indore");
        Address address2=new Address("siliguri");
        Account account1=new Account("siliguri");
        Customer customer=new Customer("Indore");
        customer.addAccount(account1);




    }

}
