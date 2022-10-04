package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.ManMapper;
import com.gong.app_school.pojo.Man;
import com.gong.app_school.services.ManServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.ManServicesImpl
 * @Date: 2022年09月27日 11:47
 * @Description:
 */
@Service
public class ManServicesImpl extends ServiceImpl<ManMapper, Man> implements ManServices {
    @Autowired
    ManMapper mapper;
    public List<Man>selectMan(){
        return mapper.selectList(new QueryWrapper<>());
    }

//    public int addMan(){
//        return
//    }
}
