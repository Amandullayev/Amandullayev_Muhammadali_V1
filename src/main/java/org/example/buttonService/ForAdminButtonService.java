package org.example.buttonService;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public interface ForAdminButtonService {
    static ReplyKeyboardMarkup adminButton() {
        List<KeyboardRow> rows = new ArrayList<>();

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardRow addBook = new KeyboardRow();
        KeyboardRow showBooks = new KeyboardRow();
        KeyboardRow back = new KeyboardRow();

        rows.add(addBook);
        rows.add(showBooks);
        rows.add(back);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        return replyKeyboardMarkup;
    }
}
