package org.example.buttonService;

public enum AdminButton {
    ADD_BOOK("Add Book"),
    SHOW_BOOK("Show Book"),
    SHOW_ORDER("Show Orders");

    String string;

    AdminButton(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
