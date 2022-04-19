package ru.gb.gbexternalapi.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.gbexternalapi.api.ManufacturerApi;
import ru.gb.gbexternalapi.dto.ManufacturerDto;

import java.util.List;
@FeignClient(url = "http://localhost:8080/api/v1/manufacturer", name = "ManufacturerGateway")
public interface ManufacturerGateway extends ManufacturerApi {

    @GetMapping(produces = "application/json;charset=UTF-8")
    List<ManufacturerDto> getManufacturerList();


}
