package com.example.bankcards.dto.CardDTO;

import com.example.bankcards.entity.CardStatus;
import com.example.bankcards.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class CardDTO {
    private Long id;
    private String cardNumber;
    private User cardOwner;
    private LocalDate expirationDate;
    private CardStatus status;
    private BigDecimal balance;
    private LocalDate createdAt;
}
