package org.vital.telegrambot.services;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

import static org.vital.telegrambot.constant.VarConsant.*;


public class SendMessageServise {
    private final ButtonService buttonService = new ButtonService();
    private final CreateMessageService createMessageService = new CreateMessageService();

    public SendMessage greetingMessage(Update update) {
        SendMessage message = createMessageService.createMessage(update, greetingMessage);
        ReplyKeyboardMarkup markup = buttonService.getMainMenu();
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage drinkMenuMessage(Update update) {
        SendMessage drinkMessage = createMessageService.createMessage(update, drinkMenuMessage);
        ReplyKeyboardMarkup markup = buttonService.getDrinksMenu();
        drinkMessage.setReplyMarkup(markup);
        return drinkMessage;
    }

    public SendMessage desertMenuMessage(Update update) {
        SendMessage desertMessage = createMessageService.createMessage(update, desertMenuMessage);
        ReplyKeyboardMarkup markup = buttonService.getDesertsMenu();
        desertMessage.setReplyMarkup(markup);
        return desertMessage;
    }

    public SendMessage saladMenuMessage(Update update) {
        SendMessage saladMessage = createMessageService.createMessage(update, saladMenuMessage);
        ReplyKeyboardMarkup markup = buttonService.getSaladMenu();
        saladMessage.setReplyMarkup(markup);
        return saladMessage;
    }

    public SendMessage burgerMenuMessage(Update update) {
        return sendMessage(update, burgerMenuMessage, buttonService.getBurgerMenu());
    }

    public SendMessage incorrectCommand(Update update) {
        return createMessageService.createMessage(update, incorrectCommandMesage);
    }

    private SendMessage sendMessage(Update update, String message, ReplyKeyboardMarkup markup) {
        SendMessage genericMessage = createMessageService.createMessage(update, message);
        genericMessage.setReplyMarkup(markup);
        return genericMessage;
    }
}
