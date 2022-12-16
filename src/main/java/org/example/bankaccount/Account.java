package org.example.bankaccount;

public class Account {
    private Address address;

    public Account(String address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address=address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "address=" + address +
                '}';
    }
}
