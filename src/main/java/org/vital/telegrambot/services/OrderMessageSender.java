package org.vital.telegrambot.services;


import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;


public class OrderMessageSender {
    private final CreateMessageService createMessageService = new CreateMessageService();

    public SendMessage orderMessage(Update update,String value){
        return createMessageService.createMessage(update,value);
    }
}
