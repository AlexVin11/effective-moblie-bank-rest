package com.example.bankcards.dto.UserDTO;

import com.example.bankcards.entity.Card;
import com.example.bankcards.entity.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public final class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<Role> role;
    private Set<Card> cards;
    private LocalDate createdAt;
}
