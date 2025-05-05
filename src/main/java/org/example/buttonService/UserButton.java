package org.example.buttonService;

public enum UserButton {
    SHOW_BOOK("Show Book"),
    HISTORY("History");

    String string;

    UserButton(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
