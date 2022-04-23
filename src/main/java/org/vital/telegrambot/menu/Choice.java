package org.vital.telegrambot.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vital.telegrambot.dataBase.MenuRepository;
import org.vital.telegrambot.orders.MenuItem;


@Service
public class Choice {
   private final MenuRepository menuRepository;

    @Autowired
    public Choice(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public MenuItem chooseMeal(String action) {
        return menuRepository.getByName(action);
    }
}
