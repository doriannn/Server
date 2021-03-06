package ld.text.springbootdemo.dao.master;

import ld.text.springbootdemo.domain.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 城市 DAO 接口类
 *
 * Created by ldong on 07/07/2018.
 */

public interface CityDao {

    City findByName(@Param("cityName")String cityName);

    City findById(@Param("CityId")Long CityId);
}
