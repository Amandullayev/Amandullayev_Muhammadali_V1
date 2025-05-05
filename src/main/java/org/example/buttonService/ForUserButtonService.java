package org.example.buttonService;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public interface ForUserButtonService {
    static ReplyKeyboardMarkup userButton(){
        List<KeyboardRow> rows = new ArrayList<>();

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardRow showBooks = new KeyboardRow();
        KeyboardRow history = new KeyboardRow();

        rows.add(showBooks);
        rows.add(history);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }
}
