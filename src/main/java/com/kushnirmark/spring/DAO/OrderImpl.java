package com.kushnirmark.spring.DAO;

import com.kushnirmark.spring.entity.ClientOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class OrderImpl implements OrderDAO {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<ClientOrder> getAllOrders() {
        Session session = sessionFactory.getCurrentSession();
        Query<ClientOrder> query = session.createQuery("from ClientOrder", ClientOrder.class);
        List<ClientOrder> clientOrder = query.getResultList();
        return clientOrder;
    }

    @Override
    public void saveOrder(ClientOrder clientOrder) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(clientOrder);
    }
}
