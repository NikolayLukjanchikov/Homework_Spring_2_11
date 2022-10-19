package com.jd10.homework_2_11.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int orderCounter;

    public Basket() {
        this.orderCounter = ++orderCounter;
    }


    public int getOrderCounter() {
        return orderCounter;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "orderCounter=" + orderCounter +
                '}';
    }
}
