package com.inktechs.orchestrator.model;


public class OrderEntity {

   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private OrderState orderState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
}
