package com.jd10.homework_2_11.controllers;

import com.jd10.homework_2_11.model.Basket;
import com.jd10.homework_2_11.services.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store/order")
@Scope("session")
public class OrderController {

    ///store/order/add
    ///store/order/get

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    private void addGoods(@RequestParam List<Integer> goods) {
         orderService.addGoods(goods);
        //return null;
    }
    @GetMapping("/get")
    private Map<Basket, List<Integer>> getGoods() {
        return orderService.getOrderBasket();
    }
}
