package com.gong.app_school.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.pojo.healthS
 * @Date: 2022年09月26日 20:03
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Health {
    private int id;
    private String xinLv;
    private String xueYa;
    private String tiWen;
    private String tiZhong;
    private String yunDongLiang;
    private int oldId;
}
