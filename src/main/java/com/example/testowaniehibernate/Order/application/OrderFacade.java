package com.example.testowaniehibernate.Order.application;

import com.example.testowaniehibernate.Order.core.OrderService;
import com.example.testowaniehibernate.Order.domain.Order;
import com.example.testowaniehibernate.Product.application.ProductFacade;
import com.example.testowaniehibernate.Product.domain.Product;
import com.example.testowaniehibernate.User.application.UserFacade;
import com.example.testowaniehibernate.User.domain.Users;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class OrderFacade {

    private OrderService orderService;
    private ProductFacade productFacade;
    private UserFacade userFacade;


    public OrderFacade(OrderService orderService, ProductFacade productFacade, UserFacade userFacade) {
        this.orderService = orderService;
        this.productFacade = productFacade;
        this.userFacade = userFacade;
    }

    public void createOrder(OrderRequest orderRequest) {
        Optional<Users> user = userFacade.findbyId(orderRequest.getUserId());
        Users user1 = new Users();
        if(user.isPresent()){
            user1.setNazwa(user.get().getNazwa());
            user1.setId(user.get().getId());
        }
        Product product1 = productFacade.getProduct(orderRequest.getProductId()).get();
        orderService.createOrder(user1, product1);
    }
    public List<Order> getAll(){
        return orderService.getAll();
    }
}
