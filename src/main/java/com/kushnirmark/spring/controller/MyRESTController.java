package com.kushnirmark.spring.controller;

import com.kushnirmark.spring.Service.OrderService;
import com.kushnirmark.spring.entity.ClientOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private OrderService orderService;

    @GetMapping("clientOrder")
    public List<ClientOrder> getAllOrders() {
        List<ClientOrder> clientOrder = orderService.getAllOrders();
        return clientOrder;
    }

    @PutMapping ("clientOrder")
    public ClientOrder addNewOrder(@RequestBody ClientOrder order) {
        orderService.saveOrder(order);
        return order;
    }
}
