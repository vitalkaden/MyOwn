package org.vital.telegrambot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.vital.telegrambot.constant.VarConstant;
import org.vital.telegrambot.menu.Choice;
import org.vital.telegrambot.orders.MenuItem;
import org.vital.telegrambot.services.OrderMessageSender;
import org.vital.telegrambot.services.SendMessageServise;

import static org.vital.telegrambot.constant.VarConstant.*;


@Component
public class RestaurantBot extends TelegramLongPollingBot {

    private final String username;
    private final String token;

    private final Choice choice;
    private final VarConstant varConstant;
    private final SendMessageServise sendMessageServise;
    private final OrderMessageSender orderMessageSender;

    @Autowired
    public RestaurantBot(SendMessageServise sendMessageServise,OrderMessageSender orderMessageSender,
                         Choice choice, VarConstant varConstant,
                         @Value("${telegram.bot.username}") String username,
                         @Value("${telegram.bot.token}") String token) {
        this.username = username;
        this.token = token;

        this.choice = choice;
        this.varConstant = varConstant;
        this.sendMessageServise = sendMessageServise;
        this.orderMessageSender = orderMessageSender;
    }

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update){

        if (update.hasMessage() && update.getMessage().hasText()) {

            String messageText = update.getMessage().getText();

            if (String.join(",", varConstant.MenuConstants()).contains(messageText)){
                MenuItem menuItem = choice.chooseMeal((messageText));
                executeMessage(orderMessageSender.orderMessage(update,menuItem.toString()));
            }

            switch (messageText){
                case HELLO,BACK,START -> executeMessage(sendMessageServise.greetingMessage(update));
                case DRINKS -> executeMessage(sendMessageServise.drinkMenuMessage(update));
                case DESERTS -> executeMessage(sendMessageServise.desertMenuMessage(update));
                case SALADS -> executeMessage(sendMessageServise.saladMenuMessage(update));
                case BURGERS -> executeMessage(sendMessageServise.burgerMenuMessage(update));
            }



            if (!String.join(",", varConstant.MenuConstants()).contains(messageText)
                    && !String.join(",", varConstant.InterfaceConstants()).contains(messageText)){
                executeMessage(sendMessageServise.incorrectCommand(update));
            }
        }
    }
    private <T extends BotApiMethod> void executeMessage(T sendMessage){
        try{
            execute(sendMessage);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
