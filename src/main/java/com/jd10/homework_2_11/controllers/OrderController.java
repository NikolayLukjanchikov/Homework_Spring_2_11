package com.jd10.homework_2_11.controllers;

import com.jd10.homework_2_11.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    private String addGoods(@RequestParam List<Integer> goods) {
        orderService.addGoods(goods);
        return "Товары добавлены в корзину";
    }

    @GetMapping("/get")
    private List<Integer> getGoods() {
        return orderService.getOrderBasket();
    }
}
