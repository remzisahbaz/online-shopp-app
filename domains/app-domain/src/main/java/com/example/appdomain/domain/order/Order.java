package com.example.appdomain.domain.order;

import com.example.appdomain.annotation.AggregateRoot;

@AggregateRoot (rootId = "order")
public class Order {

    private OrderItem orderItem;
    private Status status;

}
