package com.kushnirmark.spring.entity;



import javax.persistence.*;

@Entity
@Table(name = "client_order")
public class ClientOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_client")
    private String nameClient;

    @Column(name = "number_phone")
    private String numberPhone;

    @Column(name = "status")
    private String status;

    public ClientOrder(String nameClient, String numberPhone, String status) {
        this.nameClient = nameClient;
        this.numberPhone = numberPhone;
        this.status = status;
    }

    public ClientOrder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClientOrder{" +
                "id=" + id +
                ", nameClient='" + nameClient + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
