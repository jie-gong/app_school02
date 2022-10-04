package com.gong.app_school.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.pojo.vo.HomeAndMan
 * @Date: 2022年09月27日 11:52
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//老人归属于那个养老院
public class HomeAndMan {
    //养老院id
    private int id;
    //养老院
    private String homeName;
    //老人姓名
    private String name;
}
