package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.pojo.Home;
import com.gong.app_school.pojo.vo.HomeAndMan;
import com.gong.app_school.pojo.vo.HomeAndManTWO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.HomeMapper
 * @Date: 2022年09月26日 20:10
 * @Description:
 */
@Mapper
@Repository
public interface HomeMapper extends BaseMapper<Home> {
    List<Home> selectHome();

    List<HomeAndMan> man();

    List<HomeAndManTWO> mantwo(String homeName);

}
