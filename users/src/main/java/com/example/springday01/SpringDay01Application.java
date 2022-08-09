package com.example.springday01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.Date;

@SpringBootApplication
public class SpringDay01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDay01Application.class, args);
    }


//    @Bean
//    @Qualifier("1")
//    public  String helloMessage(){
//        return "Welcome Saleh";
//    }
//
//    @Bean
//    @Qualifier("2")
//    public  String helloMessage3(){
//        return "Welcome Saleh 2";
//    }
//
//    @Bean
//    public  String helloMessage2(@Qualifier("1") String name){
//        System.out.println("Hey from spring "+name);
//        return name;
//    }
//

//    @Bean
//    public String hey(MainController mainController){
//        System.out.println(mainController);
//        return "";
//    }


    @Bean
    public Date getDateObject(){
        return new Date();
    }
}
