package com.wsleli.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: Wsleli Wiliams
 * @Description: 功能描述
 * @Date: 2024/03/07 15:20
 */
@Configuration
@ComponentScan("com.wsleli")
@EnableAspectJAutoProxy
public class SpringConfig {
}