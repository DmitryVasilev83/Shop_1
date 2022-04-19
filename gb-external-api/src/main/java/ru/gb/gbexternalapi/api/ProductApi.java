package ru.gb.gbexternalapi.api;

import ru.gb.gbexternalapi.dto.ProductDto;

import java.util.List;

public interface ProductApi {
    List<ProductDto> getProductList();
}
