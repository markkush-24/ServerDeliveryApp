package com.kushnirmark.spring.Service;

import com.kushnirmark.spring.entity.ClientOrder;

import java.util.List;

public interface OrderService {

    public List<ClientOrder> getAllOrders();

    void saveOrder(ClientOrder clientOrder);
}
