package com.example.testowaniehibernate.App;

import com.example.testowaniehibernate.Order.application.OrderFacade;
import com.example.testowaniehibernate.Order.application.OrderRequest;
import com.example.testowaniehibernate.Order.domain.Order;
import com.example.testowaniehibernate.Product.application.ProductFacade;
import com.example.testowaniehibernate.Product.domain.Product;
import com.example.testowaniehibernate.User.application.UserFacade;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestoweApi {

    private OrderFacade orderFacade;
    private UserFacade userFacade;
    private ProductFacade productFacade;

    public RestoweApi(OrderFacade orderFacade, UserFacade userFacade, ProductFacade productFacade) {
        this.orderFacade = orderFacade;
        this.userFacade = userFacade;
        this.productFacade = productFacade;
    }
    @PostMapping("/createOrder")
    public ResponseEntity createOrder(@RequestBody OrderRequest orderRequest){
        orderFacade.createOrder(orderRequest);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
    @PostMapping("/createUser")
    public ResponseEntity createUser(@RequestBody String string){
        userFacade.addUser(string);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
    @PostMapping("/createProduct")
    public ResponseEntity createProduct(@RequestBody String string){
        productFacade.addProduct(string);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
    @GetMapping("/getOrders")
    public ResponseEntity<List<Order>> getOrder(){
        List<Order> products = orderFacade.getAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
