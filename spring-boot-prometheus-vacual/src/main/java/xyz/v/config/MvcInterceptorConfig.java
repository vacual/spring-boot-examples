package xyz.v.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import xyz.v.intercepter.RequestCounterInterceptor;
import xyz.v.intercepter.RequestTimingInterceptor;

@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurationSupport{

    @Autowired
    private RequestCounterInterceptor requestCounterInterceptor;
    
    @Autowired
    private RequestTimingInterceptor requestTimingInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则，/**表示拦截所有请求
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(requestCounterInterceptor).addPathPatterns("/**")
        .excludePathPatterns("/stuInfo/getAllStuInfoA","/account/register");   
        
        registry.addInterceptor(requestTimingInterceptor).addPathPatterns("/**");
        
        super.addInterceptors(registry);
    }
}