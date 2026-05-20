package com.projeto.vendas.controllers;

import com.projeto.vendas.entities.User;
import com.projeto.vendas.repositories.UserRepository;
import com.projeto.vendas.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserServices userServices;


    @GetMapping
        public ResponseEntity<List<User>> findAll(){
            List<User> list = userServices.findAll();
            return ResponseEntity.ok().body(list);
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<User> findByid(@PathVariable Long id){
          User obj = userServices.findById(id);
          return ResponseEntity.ok().body(obj);
        }
}
