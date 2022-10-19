package com.jd10.homework_2_11.services;

import com.jd10.homework_2_11.model.Basket;

import java.util.List;
import java.util.Map;

public interface OrderService {
    void addGoods(List<Integer> goods);

    Map<Basket, List<Integer>> getOrderBasket();

}
