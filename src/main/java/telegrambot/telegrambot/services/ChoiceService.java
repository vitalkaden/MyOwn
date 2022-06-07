package telegrambot.telegrambot.services;

import org.springframework.stereotype.Service;
import telegrambot.telegrambot.dataBase.MenuRepository;
import telegrambot.telegrambot.dataBase.MenuItem;


@Service
public record ChoiceService(MenuRepository menuRepository) {

    public MenuItem chooseMeal(String action) {
        return menuRepository.getByName(action);
    }
}
