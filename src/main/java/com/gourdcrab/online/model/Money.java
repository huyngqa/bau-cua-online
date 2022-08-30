package com.gourdcrab.online.model;

import javax.persistence.*;

@Entity
public class Money {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int moneyId;
    private int amountMoney;
    @OneToOne
    @JoinColumn(name = "user_name")
    private User user;

    public Money() {
    }

    public Money(int moneyId, int amountMoney, User user) {
        this.moneyId = moneyId;
        this.amountMoney = amountMoney;
        this.user = user;
    }

    public int getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
