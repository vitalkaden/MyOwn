package org.vital.telegrambot.orders;


import javax.persistence.*;

@Entity
@Table(name = "menu")
public class MenuItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cost")
    private int cost;
    @Column(name = "name")
    private String name;

    public MenuItem(){

    }
    public MenuItem(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Your order" + ", meal = " + name + ", $ = " + cost ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
