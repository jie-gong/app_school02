package com.gong.app_school.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.pojo.man
 * @Date: 2022年09月26日 19:59
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Man {
    private int id;
    private String name;
    private String health;
    //养老院id
    private int homeId;
    //精神
    private int js;
    //能力
    private int nl;
    //自理
    private String zl;
}
