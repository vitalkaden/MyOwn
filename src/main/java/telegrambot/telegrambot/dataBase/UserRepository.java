package telegrambot.telegrambot.dataBase;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class UserRepository{


    @PersistenceContext
    private EntityManager entityManager1;

    @Transactional
    public void setByName(UserItem userItem){
//        entityManager1.persist(userItem);

                entityManager1.createNativeQuery("INSERT INTO users (first_name,last_name,chat_id) " +
                                "VALUES (?,?,?) on duplicate key update " +
                                "first_name = VALUES (first_name),last_name = VALUES (last_name)")
        .setParameter(1,userItem.getFirstName())
        .setParameter(2,userItem.getLastName())
        .setParameter(3,userItem.getChatId())
        .executeUpdate();
    }

    @Transactional
    public void addMenuItem(UserItem userItem, MenuItem menuItem) {
        userItem.getMenuItems().add(menuItem);
        entityManager1.merge(userItem);
//        entityManager1.createNativeQuery("INSERT INTO users_menu (chat_id,id)VALUES (?,?) " +
//                        "on duplicate key update id = VALUES(id)")
//                .setParameter(1,userItem.getChatId())
//                .setParameter(2,menuItem.getId())
//                .executeUpdate();
    }
}
