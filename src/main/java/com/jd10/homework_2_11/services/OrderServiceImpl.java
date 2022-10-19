package com.jd10.homework_2_11.services;

import com.jd10.homework_2_11.model.Basket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class OrderServiceImpl implements OrderService {
   public final Map<Basket, List<Integer>> orderBasket;

    public OrderServiceImpl() {
        this.orderBasket = new HashMap<>();
    }

    @Override
    public void addGoods(List<Integer> goods) {
        Basket basketToAdd = new Basket();
        orderBasket.put(basketToAdd,goods) ;
    }

    public Map<Basket, List<Integer>> getOrderBasket() {
        return orderBasket;
    }
}
