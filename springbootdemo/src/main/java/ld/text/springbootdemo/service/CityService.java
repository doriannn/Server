package ld.text.springbootdemo.service;

import ld.text.springbootdemo.domain.City;

/**
* 城市类业务逻辑接口
 * Created by ldong 2018.7.7
* */
public interface CityService {

    City findCityByName(String cityName);
}
