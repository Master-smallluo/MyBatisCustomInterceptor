package org.sanqi.demo.mapper;

import org.apache.ibatis.annotations.Select;
import org.sanqi.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author: JenSen
 * @Date: 2024/4/17 16:06
 * @Description: BaseMapper
 */

@Repository
public interface BaseMapper<T> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<T> {

    @Select("select * from user where id = #{userId}")
    User findUserByUserId(Integer userId);
}
