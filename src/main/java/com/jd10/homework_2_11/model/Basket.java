package com.jd10.homework_2_11.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Integer> goods;

    public Basket(List<Integer> goods) {
        this.goods = goods;
    }

    public List<Integer> getGoods() {
        return Collections.unmodifiableList(goods);
    }

    public void setGoods(List<Integer> goods) {
        this.goods = goods;
    }
}
