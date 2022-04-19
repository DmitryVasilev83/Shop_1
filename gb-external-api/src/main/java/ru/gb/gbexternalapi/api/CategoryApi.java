package ru.gb.gbexternalapi.api;

import ru.gb.gbexternalapi.dto.CategoryDto;

import java.util.List;

public interface CategoryApi {
    List<CategoryDto> getCategoryList();
}
