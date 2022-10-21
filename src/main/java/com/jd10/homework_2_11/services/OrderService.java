package com.jd10.homework_2_11.services;

import java.util.List;

public interface OrderService {
    void addGoods(List<Integer> goods);

    List<Integer> getOrderBasket();
}
