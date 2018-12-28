package com.talent.config;

import com.talent.resolver.MyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guobing
 * @Title: ResolverConfig
 * @ProjectName spring-boot-02-config
 * @Description: 自定义配置类
 * @date 2018/12/27下午4:04
 */
@Configuration
public class CommonConfig {

    @Bean
    public MyResolver myResolver() {
        return new MyResolver();
    }
}
