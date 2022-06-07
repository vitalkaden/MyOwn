package telegrambot.telegrambot.services;

import org.springframework.stereotype.Service;
import telegrambot.telegrambot.dataBase.UserItem;
import telegrambot.telegrambot.dataBase.UserRepository;

@Service
public record SaveUserDataService(UserRepository userRepository) {
    public void saveUserData(UserItem userItem){
        userRepository.setByName(userItem);
    }
}
