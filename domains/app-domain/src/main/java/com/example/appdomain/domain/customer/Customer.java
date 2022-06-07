package com.example.appdomain.domain.customer;

import com.example.appdomain.annotation.AggregateRoot;

@AggregateRoot(rootId = "customer")
public class Customer {

    private IdentityNo identityNo;
    private FullName fullName;
    private Address address;
    private Phone phone;
    private Email email;
    private Order order;

    public static class Builder(){

        private IdentityNo identityNo;
        private FullName fullName;
        private Address address;
        private Phone phone;
        private Email email;
        private Order order;

        public Builder() {
        }
        public IdentityNo identityNo(String  value){
            this.identityNo=IdentityNo.of(value);
        }
    }
}
