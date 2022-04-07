package com.kushnirmark.spring.Service;

import com.kushnirmark.spring.DAO.OrderDAO;
import com.kushnirmark.spring.entity.ClientOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;


    @Override
    @Transactional
    public List<ClientOrder> getAllOrders() {
        return orderDAO.getAllOrders();
    }

    @Override
    @Transactional
    public void saveOrder(ClientOrder clientOrder) {
        orderDAO.saveOrder(clientOrder);
    }
}
