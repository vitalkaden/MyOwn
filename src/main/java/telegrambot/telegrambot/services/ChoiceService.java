package telegrambot.telegrambot.menu;

import org.springframework.stereotype.Service;
import telegrambot.telegrambot.dataBase.MenuRepository;
import telegrambot.telegrambot.orders.MenuItem;


@Service
public record ChoiceService(MenuRepository menuRepository) {

    public MenuItem chooseMeal(String action) {
        return menuRepository.getByName(action);
    }
}
