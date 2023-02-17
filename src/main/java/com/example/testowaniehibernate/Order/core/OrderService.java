package com.example.testowaniehibernate.Order.core;

import com.example.testowaniehibernate.Order.domain.Koszyk;
import com.example.testowaniehibernate.Order.domain.KoszykRepository;
import com.example.testowaniehibernate.Order.domain.Order;
import com.example.testowaniehibernate.Order.domain.OrderRepository;
import com.example.testowaniehibernate.Product.domain.Product;
import com.example.testowaniehibernate.User.domain.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final KoszykRepository koszykRepository;

    public OrderService(OrderRepository orderRepository, KoszykRepository koszykRepository) {
        this.orderRepository = orderRepository;
        this.koszykRepository = koszykRepository;
    }

    public void createOrder(Users user, Product product) {
        Order order = new Order();
        List<Product> produkty = List.of(product);
        order.setUsers(user);
        order.setProducts(produkty);
        orderRepository.save(order);
        Koszyk koszyk = new Koszyk();
        koszyk.setOrder(order);
        koszykRepository.save(koszyk);

    }
    public List<Order> getAll(){
        return orderRepository.findAll();
    }

}