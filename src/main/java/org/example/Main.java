package org.example;

import org.example.bot.BookShopBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        ResourceBundle bundle = ResourceBundle.getBundle("settings");
        TelegramBotsApi bot = new TelegramBotsApi(DefaultBotSession.class);



        bot.registerBot(
                new BookShopBot(
                        bundle.getString("bot.token"),
                        bundle.getString("bot.userName")
                )
        );
    }
}