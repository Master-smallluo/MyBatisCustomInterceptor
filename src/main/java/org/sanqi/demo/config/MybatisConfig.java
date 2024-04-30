package org.sanqi.demo.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.sanqi.demo.interceptor.InterceptorOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: JenSen
 * @Date: 2024/4/17 16:39
 * @Description: MybatisConfig
 */
@Configuration
public class MybatisConfig  {
    @Bean
    public InterceptorOne interceptorOne() {
        return new InterceptorOne();
    }
}
