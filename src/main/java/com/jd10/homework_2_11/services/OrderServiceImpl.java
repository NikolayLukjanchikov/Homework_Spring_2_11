package com.jd10.homework_2_11.services;

import com.jd10.homework_2_11.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {
    public Basket addB;

    @Override
    public void addGoods(List<Integer> goods) {
        addB = new Basket(goods);
    }

    @Override
    public List<Integer> getOrderBasket() {
        if (addB != null) {
            return addB.getGoods();
        }
        return null;
    }
}
