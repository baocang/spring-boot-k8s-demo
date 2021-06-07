package shop.rhyme.demo.springbootk8sdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "greeting")
public class GreetingConfig {

    private String message = "Hello from Java Config!";

}
