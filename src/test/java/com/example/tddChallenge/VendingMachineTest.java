package com.example.tddChallenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    @Test
    void 충분한_금액을_넣고_콜라를_선택하면_콜라가_나오고_남을_경우_돈을돌려받아야한다(){
        VendingMachine vendingMachine = new VendingMachine();

        //Given
        vendingMachine.insertCoin(500);

        //When
        String drink= vendingMachine.selectDrink("coke");

        //Then
        assertEquals("coke", drink);
    }



    @Test
    void 음료를_뽑은후_잔액을_확인할수있다() {
        VendingMachine vendingMachine = new VendingMachine();
        //Given
        vendingMachine.insertCoin(700);
        //When
        vendingMachine.selectDrink("coke");
        int balance = vendingMachine.returnBalance();
        //Then
        assertEquals(200, balance);
    }


    @Test
    void 음료_가격보다_적은금액을_


}
