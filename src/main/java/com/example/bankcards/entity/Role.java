package com.example.bankcards.entity;

public enum Role {
    ADMIN("Администратор"),
    USER("Пользователь");

    private final String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
