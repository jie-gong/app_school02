package com.gong.app_school;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gong.app_school.mapper.HomeMapper;
import com.gong.app_school.mapper.OrderMapper;
import com.gong.app_school.pojo.Home;
import com.gong.app_school.pojo.Yy;
import com.gong.app_school.pojo.vo.HomeAndMan;
import com.gong.app_school.services.impl.HomeServicesImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AppSchoolApplicationTests {

    @Autowired
    HomeMapper homeMapper;

    @Test
    public void contextLoads() {
        List<Home> homes = homeMapper.selectHome();
        for (Home home : homes) {
            System.out.println(home);
        }
    }

    @Autowired
    OrderMapper orderMapper;

    @Test
    public void qq() {
        List<Yy> yys = orderMapper.selectList(new QueryWrapper<>());
        for (Yy yy : yys) {
            System.out.println(yy);
        }
    }

    @Test
    public void ww() {
        int i = orderMapper.deleteById(1);
        if (i == 1) {
            System.out.println("删除成功");
        }
    }
    @Autowired
    private HomeServicesImpl homeServices;
    @Test
    public void aa(){
        List<HomeAndMan> homeAndMEN = homeServices.selectByOne();
        homeAndMEN.forEach(System.out::println);
    }


}
