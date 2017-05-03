package spring.hk.springcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringCenterApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SpringCenterApplication.class, args);
    }
}
