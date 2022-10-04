package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.pojo.Yy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.OrderMapper
 * @Date: 2022年09月27日 14:56
 * @Description:
 */
@Mapper
@Repository
public interface OrderMapper extends BaseMapper<Yy> {
}
