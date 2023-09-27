package com.example.ioc;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PrintBeans {
    private final ApplicationContext applicationContext;

    @Bean
    public void printBeanMethod(){
        List<String> beans = Arrays.stream(applicationContext.getBeanDefinitionNames()).toList();
        for (String beanName: beans){
            System.out.println(beans);
        }

    }
}
