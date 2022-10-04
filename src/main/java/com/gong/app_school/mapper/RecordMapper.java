package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.pojo.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.RecordMapper
 * @Date: 2022年09月26日 20:12
 * @Description:
 */
@Mapper
@Repository
public interface RecordMapper extends BaseMapper<Record> {
}
