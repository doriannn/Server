package ld.text.springbootdemo.service.impl;


import ld.text.springbootdemo.dao.master.CityDao;
import ld.text.springbootdemo.domain.City;
import ld.text.springbootdemo.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao citydao;

    @Autowired
    private RedisTemplate redisTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);
    /**
     * 获取城市逻辑：
     * 如果缓存存在，从缓存中获取城市信息
     * 如果缓存不存在，从 DB 中获取城市信息，然后插入缓存
     */
    @Override
    public City findCityByName(String cityName) {
        return citydao.findByName(cityName);
    }

    @Override
    public City findCityById(Long id) {
        String key = "city_" + id;
        ValueOperations<String, City> operations = redisTemplate.opsForValue();

        //如果缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey) {

            City city = operations.get(key);
            LOGGER.info("CityServiceImpl.findCityById()从缓存读取" + city.toString());
            return city;
        }
        //如果缓存中没有,则从数据库中获取
        City city = citydao.findById(id);
        //获取完成后更新入缓存,并设置有效时间，
        // 20s以内可以查询到，过了时间自动失效，重新从数据库里获取
        operations.set(key,city,20,TimeUnit.SECONDS);
        LOGGER.info("CityServiceImpl.findCityById()数据库读取后插入缓存：" + city.toString());

        return city;
    }

    @Override
    public City updateCity(City city) {
        return null;
    }

    @Override
    public City addCity(City city) {
        return null;
    }

    @Override
    public City deleteCityById(Long id) {
        return null;
    }
}
