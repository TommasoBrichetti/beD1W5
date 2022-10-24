package com.tommasobrichetti.bed1w5;

import com.tommasobrichetti.bed1w5.products.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeD1W5Application {

    public static void main(String[] args) {
        SpringApplication.run(BeD1W5Application.class, args);
        conf1();
    }

    public static void conf1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Consumation p1 = ctx.getBean("Olivarola", Consumation.class);
        System.out.println(p1);

    }

}
