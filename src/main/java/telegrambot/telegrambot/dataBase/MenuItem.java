package telegrambot.telegrambot.dataBase;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "menu")
public class MenuItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "cost")
    private int cost;
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "menuItems")
    private Set<UserItem> userItems = new HashSet<>();

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

    public Set<UserItem> getUserItems() {
        return userItems;
    }
}
