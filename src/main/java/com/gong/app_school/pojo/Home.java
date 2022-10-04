package com.gong.app_school.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.pojo.home
 * @Date: 2022年09月26日 19:56
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Home {
    private int id;
    //养老院
    private String homeName;
    //健康情况
    private String evaluate;
    private int oldManId;
    //养老院信息
    private String xx;
    //介绍
    private String js;
    //地址
    private String dz;
    //电话
    private String phone;

}
