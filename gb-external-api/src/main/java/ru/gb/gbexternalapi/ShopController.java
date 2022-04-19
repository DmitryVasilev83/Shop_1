package ru.gb.gbexternalapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.gbexternalapi.dto.CategoryDto;
import ru.gb.gbexternalapi.dto.ManufacturerDto;
import ru.gb.gbexternalapi.dto.ProductDto;
import ru.gb.gbexternalapi.gateway.CategoryGateway;
import ru.gb.gbexternalapi.gateway.ManufacturerGateway;
import ru.gb.gbexternalapi.gateway.ProductGateway;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/shop")
public class ShopController {
    private final ProductGateway productGateway;

    private final ManufacturerGateway manufacturerGateway;

    private final CategoryGateway categoryGateway;

    @GetMapping("/product")
    public List<ProductDto> getProducts(){
        return productGateway.getProductList();
    }

    @GetMapping("/manufacturer")
    public List<ManufacturerDto> getManufacturer(){
        return manufacturerGateway.getManufacturerList();
    }

    @GetMapping("/category")
    public List<CategoryDto> getCategory(){
        return categoryGateway.getCategoryList();
    }

}
