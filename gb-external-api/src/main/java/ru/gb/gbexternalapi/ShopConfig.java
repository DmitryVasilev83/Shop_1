package ru.gb.gbexternalapi;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import ru.gb.gbexternalapi.gateway.CategoryGateway;
import ru.gb.gbexternalapi.gateway.ProductGateway;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAwareBean")
@EnableFeignClients(clients = {CategoryGateway.class,
        ProductGateway.class,
        CategoryGateway.class})
public class ShopConfig {

    @Bean
    public AuditorAware<String> auditorAwareBean() {
        return () -> Optional.of("User");
    }
}
