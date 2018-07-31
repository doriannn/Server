package ld.text.springbootdemo.dao.cluster;

import ld.text.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User findByName(@Param("userName")String userName);
}
