package com.gong.app_school.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.pojo.record
 * @Date: 2022年09月26日 20:01
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private int id;
    private String record;
    private String name;
    private int oldId;
}
