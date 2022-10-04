package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.HomeMapper;
import com.gong.app_school.pojo.Home;
import com.gong.app_school.pojo.vo.HomeAndMan;
import com.gong.app_school.pojo.vo.HomeAndManTWO;
import com.gong.app_school.services.HomeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.WeakHashMap;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.HomeServicesImpl
 * @Date: 2022年09月26日 20:23
 * @Description:
 */
@Service
public class HomeServicesImpl extends ServiceImpl<HomeMapper, Home> implements HomeServices {
    @Autowired
    private HomeMapper homeMapper;

    //查询全部养老院
    public List<Home> selectHomes() {
        return homeMapper.selectList(null);
    }

    //查询单个养老院
    public Home selectByOneHome(String name) {
        QueryWrapper<Home> homeQueryWrapper = new QueryWrapper<>();
        homeQueryWrapper.eq("home_name", name);
        return homeMapper.selectOne(homeQueryWrapper);
    }

    //
    public List<HomeAndMan> selectByOne() {
        return homeMapper.man();
    }

    public List<HomeAndManTWO>selectman(String name){
        return homeMapper.mantwo(name);
    }
}
