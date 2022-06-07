package telegrambot.telegrambot.services;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public record OrderMessageSender(CreateMessageService createMessageService) {

    public SendMessage orderMessage(Update update, String value) {
        return createMessageService.createMessage(update, value);
    }
}
