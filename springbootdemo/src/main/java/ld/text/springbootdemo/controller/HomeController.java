package ld.text.springbootdemo.controller;


import ld.text.springbootdemo.domain.City;
import ld.text.springbootdemo.domain.User;
import ld.text.springbootdemo.properties.HomeProperties;
import ld.text.springbootdemo.service.CityService;
import ld.text.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Spring Boot properties练习
 *
 * Created by ldong on 18/7/04.
 */
@RestController
//@RequestMapping("/home")
public class HomeController {

    @Autowired
    HomeProperties homeProperties;

    @Autowired
    private CityService cityService;

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String Home() {
        String bb;
        bb = homeProperties.toString();
        return bb;
    }
    
    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public City findCityById(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findOneUser(@RequestParam(value = "userName", required = true) String userName) {
        return userService.findUserByName(userName);
    }
}
