package ld.text.springbootdemo.config.ds;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.redis")
/*
* 跟程序内容没啥关系，自已用来练习配置文件注入的
* */
public class RedisConfig {


    /*
    * spring.redis.database=0
    ## Redis服务器地址
    spring.redis.host=127.0.0.1
    ## Redis服务器连接端口
    spring.redis.port=6379
    * */

    private String database;

    private String host;

    private String port;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getAll() {
        return this.toString();
    }

}
