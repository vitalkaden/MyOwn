package telegrambot.telegrambot.dataBase;

import javax.persistence.*;

@Entity
@Table(name = "OrdersTable")
public class MenuOrders {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cost")
    private int cost;
    @Column(name = "name")
    private String name;

    public MenuOrders() {

    }

    public MenuOrders(int id, int cost, String name) {
        this.id = id;
        this.cost = cost;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
