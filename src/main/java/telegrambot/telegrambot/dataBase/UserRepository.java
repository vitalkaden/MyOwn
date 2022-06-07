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



//    private String URL = "jdbc:mysql://localhost:3306/TelBotDB";
//    private String USER = "root";
//    private String PASSWORD = "mozgorez2";
//    private Connection connection;

//        try {
//            connection = DriverManager.getConnection(URL,USER,PASSWORD);
//            PreparedStatement  preparedStatement= connection.prepareStatement("INSERT INTO users(FirstName,LastName,ChatId)
//            VALUES (?,?,?) ON DUPLICATE KEY UPDATE FirstName = VALUES (FirstName),LastName = VALUES (LastName),chatId = VALUES (chatId)");
//            preparedStatement.setString(1,firstName);
//            preparedStatement.setString(2,lastName);
//            preparedStatement.setLong(3,chatId);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
