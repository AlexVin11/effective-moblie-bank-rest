package com.example.bankcards.dto.UserDTO;

import com.example.bankcards.entity.Card;
import com.example.bankcards.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Set;

@Getter
@Setter
public final class UserUpdateDTO {
    private JsonNullable<String> firstName;
    private JsonNullable<String> lastName;

    @NotNull
    @Email
    private JsonNullable<String> email;

    @NotNull
    @NotBlank
    private JsonNullable<Set<Role>> role;

    @NotBlank
    @NotNull
    private JsonNullable<Set<Card>> cards;

    @NotNull
    @NotBlank
    @Size(min = 3)
    private JsonNullable<String> password;
}
