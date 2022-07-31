package telegrambot.telegrambot.dataBase;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserItem {

    private String firstName;
    private String lastName;
    @Id
    private long chatId;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Users_menu",
            joinColumns = { @JoinColumn(name = "chat_id") },
            inverseJoinColumns = { @JoinColumn(name = "id") }
    )
    Set<MenuItem> menuItems = new HashSet<>();

    public UserItem(String firstName, String lastName, long chatId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.chatId = chatId;
    }

    public UserItem() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public Set<MenuItem> getMenuItems() {
        return menuItems;
    }
}
