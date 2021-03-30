package com.example.game_shop.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "users")
public class User {

    @Id
    @Column(name = "id")

    private int id ;
    @Column(name = "name")

    private String name;

    @Column(name = "money")
    private double money;


    public User(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
