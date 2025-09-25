package com.io.tdd;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private int balance = 0;
    private final Map<String, Integer> prices = new HashMap<>();

    public VendingMachine() {
        prices.put("coke", 500);
        prices.put("cheeryAde", 500);
        prices.put("coffee", 700);
    }

    public void insertCoin(int coin) {
        balance += coin;
    }

    public String selectDrink(String drinkName) {

      int price = prices.getOrDefault(drinkName, 0);

        if(price == 0) throw new IllegalArgumentException("없는 음료입니다");

        if(balance < price){
            throw new IllegalArgumentException("금액을 더 넣어주세요.");
        }

        balance -= price;

        return drinkName;
    }

    public int returnBalance() {
        return balance;
    }

}
