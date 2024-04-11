package com.wsleli.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/09 11:32
 */
// 创建springmvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.wsleli.controller")
public class SpringMvcConfig {
}