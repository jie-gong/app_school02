package com.gong.app_school.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gong.app_school.mapper.HomeMapper;
import com.gong.app_school.mapper.ManMapper;
import com.gong.app_school.pojo.*;
import com.gong.app_school.pojo.vo.HomeAndMan;
import com.gong.app_school.pojo.vo.HomeAndManTWO;
import com.gong.app_school.returnJson.ReturnObject;
import com.gong.app_school.services.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.WeakHashMap;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.controller.LController
 * @Date: 2022年09月26日 20:16
 * @Description:
 */
@Controller
@RequestMapping("/app")
public class LController {
    @Resource
    HomeServicesImpl homeServices;

    //查询全部养老院
    @RequestMapping("/allhome")
    @ResponseBody
    public Object selectHomes() {
        List<Home> homes = homeServices.selectHomes();
        if (homes != null) {
            return JSONObject.toJSON(new ReturnObject(200, "操作成功", homes.size(), homes));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "操作失败"));
        }
    }

    @Resource
    ManServicesImpl manServices;

    //查询全部老人
    @RequestMapping("/allman")
    @ResponseBody
    public Object selectMan() {
        List<Man> men = manServices.selectMan();
        if (men != null) {
            return JSONObject.toJSON(new ReturnObject(200, "操作成功", men.size(), men));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "操作失败"));
        }
    }

    //查询单个养老院
    @RequestMapping("/selectByOneHome")
    @ResponseBody
    public Object selectByOneHome(@RequestBody JSONObject jsonObject) {
        String homename = jsonObject.getString("home_name");
        Home home = homeServices.selectByOneHome(homename);
        if (home != null) {
            return JSONObject.toJSON(home);
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "操作失败"));
        }
    }

    @Autowired
    private EnvironmentServicesImpl environmentServices;

    //环境信息
    @RequestMapping("/selectHJ")
    @ResponseBody
    public Object selectHJ() {
        List<Environment> environments = environmentServices.selectEv();
        if (environments != null) {
            return JSONObject.toJSON(new ReturnObject(200, "操作成功", environments.size(), environments));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "操作失败"));
        }
    }

    //预约记录
    @Autowired
    private OrderServicesImpl orderServices;

    @RequestMapping("/YY")
    @ResponseBody
    public Object selectYY() {
        List<Yy> yys = orderServices.selectJL();
        if (yys.size() != 0) {
            return JSONObject.toJSON(new ReturnObject(200, "操作成功", yys.size(), yys));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "当前没有预约记录"));
        }
    }

    //删除预约记录
    @PostMapping("/delete")
    @ResponseBody
    public Object deleteJL(@RequestBody JSONObject jsonObject) {
        Integer id = jsonObject.getInteger("id");
        int deleted = orderServices.deleted(id);
        if (deleted == 1) {
            return JSONObject.toJSON(new ReturnObject(200, "删除成功"));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "删除失败"));
        }
    }

    @Autowired
    private HomeMapper homeMapper;
    @Autowired
    private ManMapper mapper;

    //添加预约信息
    @PostMapping("/insterJL")
    @ResponseBody
    public Object insterJL(@RequestBody JSONObject jsonObject) {
        Integer id = jsonObject.getInteger("id");
        //养老院名称
        String name = jsonObject.getString("home_name");
        //设施
        String facility = jsonObject.getString("facility");
        //服务
        String serve = jsonObject.getString("serve");
        String name1 = jsonObject.getString("old_name");

        int inster = orderServices.inster(id, name, name1, facility, serve);
        if (inster == 1) {
            //通过养老院查询老人id
            QueryWrapper<Home> stringObjectWeakHashMap = new QueryWrapper<>();
            stringObjectWeakHashMap.eq("home_name", name);
            Home home = homeMapper.selectOne(stringObjectWeakHashMap);
            System.out.println(home);
            if (home == null) {
                return JSONObject.toJSON(new ReturnObject(500, "查询不到" + name));
            }
            //获取查询出来的id
            int old_man_id = home.getOldManId();
            System.out.println(old_man_id);
            //插入新的人员信息
            Man man = new Man();
            man.setName(name1);
            man.setHomeId(old_man_id);
            int insert = mapper.insert(man);
            if (insert == 1) {
                return JSONObject.toJSON(new ReturnObject(200, name1 + "添加成功"));
            } else {
                return JSONObject.toJSON(new ReturnObject(500, "添加失败"));

            }
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "添加失败"));
        }
    }

    @Autowired
    private HealthSServicesImpl healthSServices;

    //查询所有房间环境状态信息
    @RequestMapping("/selectRoom")
    @ResponseBody
    public Object selectRoom() {
        List<Health> health = healthSServices.selectList();
        if (health.size() != 0) {
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", health.size(), health));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }

    //查旬老人所在的养老院
    @RequestMapping("/selectManAndHome")
    @ResponseBody
    public Object selectManAndHome() {
        List<HomeAndMan> homeAndMEN = homeServices.selectByOne();
        if (homeAndMEN.size() != 0) {
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", homeAndMEN.size(), homeAndMEN));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }
    //通过养老院名称查询人员
    @PostMapping("/selectManByHome")
    @ResponseBody
    public Object selectManByHome(@RequestBody JSONObject jsonObject){
        String home_name = jsonObject.getString("home_name");
        List<HomeAndManTWO> selectman = homeServices.selectman(home_name);
        if (selectman.size() != 0) {
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", selectman.size(), selectman));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }

}
