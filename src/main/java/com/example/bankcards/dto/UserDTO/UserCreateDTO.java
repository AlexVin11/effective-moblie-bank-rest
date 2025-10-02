package com.example.bankcards.dto.UserDTO;

import com.example.bankcards.entity.Card;
import com.example.bankcards.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public final class UserCreateDTO {
    private String firstName;
    private String lastName;

    @NotNull
    @Email
    private String email;

    @NotBlank
    @NotNull
    private Set<Role> role;

    @NotBlank
    @NotNull
    private Set<Card> cards;

    @NotNull
    @NotBlank
    @Size(min = 3)
    private String password;
}
