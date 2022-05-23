package peaksoft.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    @Bean
    public Animal dog(){
        return new Dog();
    }
}
