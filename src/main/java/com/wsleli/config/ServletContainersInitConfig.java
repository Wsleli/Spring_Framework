package com.wsleli.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/11 10:41
 */
// 定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 乱码处理
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}

// 定义一个servlet容器启动的配置类，在里面加载spring的配置
// public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//     // 加载springMVC容器配置
//     @Override
//     protected WebApplicationContext createServletApplicationContext() {
//         AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//         ctx.register(SpringMvcConfig.class);
//         return ctx;
//     }
//
//     // 加载spring容器配置
//     @Override
//     protected WebApplicationContext createRootApplicationContext() {
//         AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//         ctx.register(SpringConfig.class);
//         return ctx;
//     }
//
//     // 设置哪些请求归属springMVC处理
//     @Override
//     protected String[] getServletMappings() {
//         return new String[]{"/"};
//     }
// }