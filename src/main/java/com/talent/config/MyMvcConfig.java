package com.talent.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author guobing
 * @Title: MyMvcConfig
 * @ProjectName spring-boot-02-config
 * @Description: Spring MVC配置类
 * @date 2018/12/28上午10:33
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 添加一个视图映射
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送 /talent请求，会映射到success页面
        registry.addViewController("/talent")
                .setViewName("success");
    }
}
