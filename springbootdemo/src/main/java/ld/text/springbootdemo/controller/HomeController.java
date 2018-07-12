package ld.text.springbootdemo.controller;


import ld.text.springbootdemo.domain.City;
import ld.text.springbootdemo.properties.HomeProperties;
import ld.text.springbootdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
