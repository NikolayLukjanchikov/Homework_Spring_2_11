package com.jd10.homework_2_11.model;

import java.util.List;

public class Basket {
    private List<Integer> goods;

    public Basket(List<Integer> goods) {
        this.goods = goods;
    }

    public List<Integer> getGoods() {
        return goods;
    }
}
