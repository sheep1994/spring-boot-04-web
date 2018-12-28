package com.talent.resolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author guobing
 * @Title: MyResolver
 * @ProjectName spring-boot-02-config
 * @Description: 自定义视图解析器
 * @date 2018/12/27下午4:05
 */
public class MyResolver implements ViewResolver {

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return null;
    }
}
