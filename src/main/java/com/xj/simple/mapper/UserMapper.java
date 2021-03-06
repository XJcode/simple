package com.xj.simple.mapper;

import com.xj.simple.domain.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author xj
 * @since 2021-10-31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
