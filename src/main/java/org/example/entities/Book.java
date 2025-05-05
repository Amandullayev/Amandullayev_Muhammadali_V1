package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.telegram.telegrambots.meta.api.objects.ChatPhoto;
import org.telegram.telegrambots.meta.api.objects.Document;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;
    private UUID id;
    private Long price;
    private int quantity;
    private ChatPhoto bookPhoto;
    private Document bookDocument;
}
