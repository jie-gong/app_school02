package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.HealthSMapper;
import com.gong.app_school.pojo.Health;
import com.gong.app_school.services.HealthSServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.HealthSServicesImpl
 * @Date: 2022年09月27日 16:16
 * @Description:
 */
@Service
public class HealthSServicesImpl extends ServiceImpl<HealthSMapper, Health> implements HealthSServices {

    @Autowired
    private HealthSMapper healthSMapper;

    public List<Health> selectList() {
        return healthSMapper.selectList(new QueryWrapper<>());
    }
}
