package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private UUID id;
    private Long userChatId;
    private UUID bookId;
    private String name;
    private Long price;
    private int quantity;
    private String bookPhotoField;
    private String bookDocumentField;
    private boolean isSolid;
}
