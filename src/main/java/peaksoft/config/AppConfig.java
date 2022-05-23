package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.Animal;
import peaksoft.model.Cat;
import peaksoft.model.Dog;
import peaksoft.model.Timer;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
//
//    @Bean
//    public Animal animal() {
//        return new Cat();
//    }
//
//    @Bean
//    public Animal animal1() {
//        return new Dog();
//    }
//
//    @Bean
//    public Timer timer() {
//        return timer();
//    }
}
