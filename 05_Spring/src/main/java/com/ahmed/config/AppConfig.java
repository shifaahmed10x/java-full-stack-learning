package com.ahmed.config;

import com.ahmed.Alien;
import com.ahmed.Computer;
import com.ahmed.Desktop;
import com.ahmed.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ahmed")
public class AppConfig {

//    @Bean
//    public Alien alien1( Computer com) { //@Qualifier("desk1")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//   // @Bean(name = {"comp2","desktop1"})
//    @Bean
//    @Scope("prototype")
//    public Desktop desk1(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop1(){
//        return new Laptop();
//    }


}
