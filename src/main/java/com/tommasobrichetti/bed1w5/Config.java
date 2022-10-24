package com.tommasobrichetti.bed1w5;

import com.tommasobrichetti.bed1w5.products.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope
    public Consumation Olivarola(){
        return new ExtraPomodoro(new ExtraMozzarella( new ExtraOlive(new Pizza())));
    }


}
