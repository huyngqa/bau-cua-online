package com.gourdcrab.online.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name = "user_name")
    private String userName;
    private String password;
    private String name;
    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Role role;
    @OneToOne(mappedBy = "user")
    private Money money;

    public User() {
    }

    public User(String userName, String password, String name, Role role, Money money) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.role = role;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
