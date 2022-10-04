package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.EnvironmentMapper;
import com.gong.app_school.pojo.Environment;
import com.gong.app_school.pojo.Yy;
import com.gong.app_school.services.EnvironmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.EnvironmentServicesImpl
 * @Date: 2022年09月27日 14:43
 * @Description:
 */
@Service
public class EnvironmentServicesImpl extends ServiceImpl<EnvironmentMapper, Environment> implements EnvironmentServices {
    @Autowired
    EnvironmentMapper environmentMapper;

    //查询全部指标
    public List<Environment> selectEv() {
        return environmentMapper.selectList(new QueryWrapper<>());
    }

}
