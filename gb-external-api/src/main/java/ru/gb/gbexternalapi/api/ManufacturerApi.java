package ru.gb.gbexternalapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.gbexternalapi.dto.ManufacturerDto;

import java.util.List;

public interface ManufacturerApi {
    @GetMapping
    List<ManufacturerDto> getManufacturerList();
}
