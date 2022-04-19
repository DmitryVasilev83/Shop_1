package ru.gb.gbexternalapi.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.gbexternalapi.api.ProductApi;
import ru.gb.gbexternalapi.dto.ProductDto;

import java.util.List;

@FeignClient(url = "http://localhost:8080/api/v1/product", name = "ProductGateway")
public interface ProductGateway extends ProductApi {

    @GetMapping(produces = "application/json;charset=UTF-8")
    List<ProductDto> getProductList();

}
