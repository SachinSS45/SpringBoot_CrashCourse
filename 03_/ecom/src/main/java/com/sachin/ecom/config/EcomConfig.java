package com.sachin.ecom.config;

import com.sachin.ecomassistant.service.DeprecatedUtilityService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "com.sachin.ecomassistant",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {DeprecatedUtilityService.class})
)
public class EcomConfig {

}
