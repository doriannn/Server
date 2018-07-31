package ld.text.springbootdemo.controller;



import ld.text.springbootdemo.config.ds.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
@EnableConfigurationProperties(ld.text.springbootdemo.config.ds.RedisConfig.class)
public class HelloWorldController {

    @Autowired
    RedisConfig redisConfig;

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String redisTest() {

        return redisConfig.getAll();
    }
}