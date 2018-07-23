package ld.text.springbootdemo.service.impl;

import ld.text.springbootdemo.dao.master.CityDao;
import ld.text.springbootdemo.domain.City;
import ld.text.springbootdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityDao citydao;

    @Override
    public City findCityByName(String cityName) {
        return citydao.findByName(cityName);
    }
}
