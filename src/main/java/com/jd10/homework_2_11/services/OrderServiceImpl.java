package com.jd10.homework_2_11.services;

import com.jd10.homework_2_11.model.Basket;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addGoods(List<Integer> goods) {
        basket.setGoods(goods);
    }

    @Override
    public List<Integer> getOrderBasket() {
        return Collections.unmodifiableList(basket.getGoods());
    }
}
