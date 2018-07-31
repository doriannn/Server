package ld.text.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot应用
@SpringBootApplication
//Mybatis的注释，mapper接口类扫描包配置
//@MapperScan("ld.text.springbootdemo.dao")
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }
}
