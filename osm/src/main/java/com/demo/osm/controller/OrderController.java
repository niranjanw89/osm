package com.demo.osm.controller;

import com.demo.osm.entity.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/")
public class OrderController {
    @PostMapping("/order")
    public String submit(@RequestBody Order order) {
        return null;
    }
}
