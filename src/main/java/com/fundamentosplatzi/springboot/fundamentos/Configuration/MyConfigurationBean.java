package com.fundamentosplatzi.springboot.fundamentos.Configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public void MyBean beanOperation(){
        return MyBeanImplement();
    }
}
