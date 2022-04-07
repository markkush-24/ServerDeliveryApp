package com.kushnirmark.spring.DAO;

import com.kushnirmark.spring.entity.ClientOrder;

import java.util.List;

public interface OrderDAO {

    List<ClientOrder> getAllOrders();

    void saveOrder(ClientOrder clientOrder);

}
