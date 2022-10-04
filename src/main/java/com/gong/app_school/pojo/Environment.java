package com.gong.app_school.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.pojo.environment
 * @Date: 2022年09月26日 20:06
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Environment {
    private int id;
    private String co2;
    private String pm;
    private String wd;

}
