package com.dimple.maintenance.domain;

import com.dimple.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @className Rule
 * @description 评优评奖规则(Rule)实体类
 * @auther Dimple
 * @date 2019/4/17
 * @Version 1.0
 */
@Data
public class Rule extends BaseEntity {
    private static final long serialVersionUID = -59289428814117338L;

    private Long ruleId;
    /**
     * 开启时间
     **/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date openTime;
    /**
     * 关闭时间
     **/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date closeTime;
    /**
     * 具体的策略的id
     **/
    private Integer polId;
    /**
     * 规则名称
     */
    private String ruleName;
    /**
     * 规则状态
     */
    private String status;

    /**
     * 策略的名称
     */
    private String polName;

}
