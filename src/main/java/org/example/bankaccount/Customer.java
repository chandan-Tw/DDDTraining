package org.example.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<Account> accountList;
    private Address address;

    public Customer(Address address) {
        this.address = address;
        this.accountList = new ArrayList<>();
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public Address getAddress() {
        return address;
    }
    public void updateAddress(Address address){
        this.address=address;
        accountList.forEach(account -> account.setAddress(address));
    }
    public void addAccount(Account account){
        accountList.add(account);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountList=" + accountList +
                ", address=" + address +
                '}';
    }
}
