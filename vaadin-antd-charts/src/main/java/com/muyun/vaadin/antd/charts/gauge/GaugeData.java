package com.muyun.vaadin.antd.charts.gauge;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * GauageData
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class GaugeData {

    String name;

    /**
     * 设置仪表盘指针的目标值
     */
    Number target;


    /**
     * 设置仪表盘刻度的最大范围值
     */
    Number total;

    /**
     * 设置仪表盘指针指向的百分比(配置percent时，target、total值会失效，thresholds请设置在合理区间，否则会造成渲染错误 )
     */
    Number percent;

    /**
     * 设置仪表盘刻度阈值区间
     */
    Number[] thresholds;
}