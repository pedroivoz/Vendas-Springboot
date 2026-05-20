package com.projeto.vendas.controllers;

import com.projeto.vendas.entities.Order;
import com.projeto.vendas.entities.User;
import com.projeto.vendas.repositories.UserRepository;
import com.projeto.vendas.services.OrderService;
import com.projeto.vendas.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/orders")
public class OrderController {

    @Autowired
    private OrderService orderServices;

    @GetMapping
        public ResponseEntity<List<Order>> findAll(){
            List<Order> list = orderServices.findAll();
            return ResponseEntity.ok().body(list);
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<Order> findByid(@PathVariable Long id){
          Order obj = orderServices.findById(id);
          return ResponseEntity.ok(obj);
        }
}
