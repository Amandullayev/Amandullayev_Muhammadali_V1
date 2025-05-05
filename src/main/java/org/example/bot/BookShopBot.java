package org.example.bot;

import org.example.menu.MainMenuForAdmin;
import org.example.menu.MainMenuForUser;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ResourceBundle;

public class BookShopBot extends TelegramLongPollingBot {
    private String userName;

    public BookShopBot(String userName, String botToken) {
        super(botToken);
        this.userName = userName;
    }

    @Override
    public void onUpdateReceived(Update update) {
        String text = update.getMessage().getText();
        Message message = new Message();
        Long chatId = message.getChatId();
        if (text.equals("/start")) {
            if (isAdmin(chatId)) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Xush kelipsiz Mr.Admin");
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Xush kelipsiz!");
                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (isAdmin(chatId)){
            MainMenuForAdmin.run();
        }else {
            MainMenuForUser.run();
        }
    }

    @Override
    public String getBotUsername() {
        return userName;
    }


    public boolean isAdmin(Long id){
        ResourceBundle bundle = ResourceBundle.getBundle("settings");
        return bundle.getString("adminId").equals(String.valueOf(id));
    }

}
