package org.vital.telegrambot.services;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import java.util.ArrayList;
import java.util.List;

public class ButtonService {

    public ReplyKeyboardMarkup getMainMenu(){
        ReplyKeyboardMarkup markupMainMenu = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        row.add("drinks");
        row.add("deserts");
        row.add("burgers");
        row.add("salads");

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);

        markupMainMenu.setKeyboard(rows);
        return markupMainMenu;
    }
    public ReplyKeyboardMarkup getDrinksMenu(){
        ReplyKeyboardMarkup markupMeals = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        row.add("juice");
        row.add("beer");
        row.add("coffee");
        row.add("tea");
        row.add("water");
        row.add("back");
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);

        markupMeals.setKeyboard(rows);
        return markupMeals;
    }
    public ReplyKeyboardMarkup getDesertsMenu(){
        ReplyKeyboardMarkup markupMeals = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        row.add("cake");
        row.add("cheesecake");
        row.add("cookie");
        row.add("tiramisu");
        row.add("back");
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);

        markupMeals.setKeyboard(rows);
        return markupMeals;
    }

    public ReplyKeyboardMarkup getSaladMenu() {
        ReplyKeyboardMarkup markupMeals = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        row.add("cesar");
        row.add("vitamin");
        row.add("vegan");
        row.add("summer");
        row.add("back");
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);

        markupMeals.setKeyboard(rows);
        return markupMeals;
    }

    public ReplyKeyboardMarkup getBurgerMenu() {
        ReplyKeyboardMarkup markupMeals = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        row.add("chicken");
        row.add("vegetarian");
        row.add("epic");
        row.add("beef");
        row.add("back");
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);

        markupMeals.setKeyboard(rows);
        return markupMeals;
    }
}
