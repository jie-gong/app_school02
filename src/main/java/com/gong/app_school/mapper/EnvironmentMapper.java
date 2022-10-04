package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.pojo.Environment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.environmentMapper
 * @Date: 2022年09月26日 20:07
 * @Description:
 */
@Mapper
@Repository//持久层框架
public interface EnvironmentMapper extends BaseMapper<Environment> {
}
