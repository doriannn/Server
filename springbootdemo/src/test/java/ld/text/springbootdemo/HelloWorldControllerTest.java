package ld.text.springbootdemo;

import ld.text.springbootdemo.controller.HelloWorldController;
import ld.text.springbootdemo.properties.HomeProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 * Spring Boot HelloWorldController 测试 - {@link HelloWorldController}
 *
 * Created by bysocket on 16/4/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {

    @Autowired
    HomeProperties homeProperties;

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }

    @Test
    public void testProperties() {
       // Assert.assertEquals(homeProperties.getCity(),"Beijing");
        assertEquals("Beijing",homeProperties.getCity());
    }
}