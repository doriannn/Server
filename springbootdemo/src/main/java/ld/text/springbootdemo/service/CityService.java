package ld.text.springbootdemo.service;

import ld.text.springbootdemo.domain.City;

/**
* 城市类业务逻辑接口
 * Created by ldong 2018.7.7
* */
public interface CityService {

    /**
     * 根据城市名查询城市信息
    * */
    City findCityByName(String cityName);

    /**
     * 根据城市ID 查询城市信息
     * */
    City findCityById(Long id);

    /**
     * 更新城市信息
     * */
    City updateCity(City city);

    /**
     * 增加城市信息
     * */
    City addCity(City city);

    /**
     * 通过ID删除城市信息
     * */
    City deleteCityById(Long id);

}
