package com.alibaba.cloud.config;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class RibbonConfig {

    @Bean
    public IClientConfig iClientConfig(){
        return new DefaultClientConfigImpl();
    }
}
