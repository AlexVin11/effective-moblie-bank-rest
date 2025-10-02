package com.example.bankcards.dto.CardDTO;

import com.example.bankcards.entity.CardStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.openapitools.jackson.nullable.JsonNullable;

@Getter
@Setter
public class CardUpdateDTO {
    @NotNull
    @NotBlank
    private JsonNullable<CardStatus> cardStatus;
}
