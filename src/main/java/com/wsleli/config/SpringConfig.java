package com.wsleli.config;

import org.springframework.context.annotation.*;

/**
 * @Author: Wsleli Wiliams
 * @Description: 功能描述
 * @Date: 2024/03/07 15:20
 */
@Configuration
@ComponentScan("com.wsleli")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}