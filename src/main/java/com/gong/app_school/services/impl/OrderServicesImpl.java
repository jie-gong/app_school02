package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.OrderMapper;
import com.gong.app_school.pojo.Yy;
import com.gong.app_school.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.OrderSercvicesImpl
 * @Date: 2022年09月27日 14:59
 * @Description:
 */
@Service
public class OrderServicesImpl extends ServiceImpl<OrderMapper, Yy> implements OrderServices {
    @Autowired
    OrderMapper orderMapper;

    //查询全部预记录
    public List<Yy> selectJL() {
        return orderMapper.selectList(new QueryWrapper<>());
    }

    //删除单个预约记录
    public int deleted(int id) {
        return orderMapper.deleteById(id);
    }

    //添加预约信息
    public int inster(int id, String name, String facility, String serve, String name1) {
        return orderMapper.insert(new Yy(id, name, facility, serve, name1));
    }
}
