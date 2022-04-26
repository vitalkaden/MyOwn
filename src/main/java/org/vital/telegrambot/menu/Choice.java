package org.vital.telegrambot.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vital.telegrambot.dataBase.MenuRepository;
import org.vital.telegrambot.orders.MenuItem;


@Service
public record Choice(MenuRepository menuRepository) {
    @Autowired
    public Choice {
    }

    public MenuItem chooseMeal(String action) {
        return menuRepository.getByName(action);
    }
}
