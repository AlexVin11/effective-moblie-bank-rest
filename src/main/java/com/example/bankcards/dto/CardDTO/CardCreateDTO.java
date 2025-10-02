package com.example.bankcards.dto.CardDTO;

import com.example.bankcards.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CardCreateDTO {
    @NotBlank
    @NotNull
    private String cardNumber;

    @NotBlank
    @NotNull
    private User cardOwner;

    @NotBlank
    @NotNull
    private LocalDate expirationDate;
}
