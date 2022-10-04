package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.pojo.Man;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.ManMapper
 * @Date: 2022年09月26日 20:11
 * @Description:
 */
@Mapper
@Repository
public interface ManMapper extends BaseMapper<Man> {
}
