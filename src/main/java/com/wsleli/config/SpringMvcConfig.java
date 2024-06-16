package com.wsleli.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/06/13 23:09
 */
@Configuration
@ComponentScan({"com.wsleli.controller", "com.wsleli.config"})
@EnableWebMvc
public class SpringMvcConfig {
}