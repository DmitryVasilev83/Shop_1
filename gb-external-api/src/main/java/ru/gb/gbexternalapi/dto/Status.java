package ru.gb.gbexternalapi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Status {
    ACTIVE("Доступно"), DISABLED("Недоступно");

    private final String title;
}
