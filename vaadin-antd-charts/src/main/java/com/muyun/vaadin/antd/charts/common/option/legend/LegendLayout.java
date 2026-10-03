package com.muyun.vaadin.antd.charts.common.option.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * LegendLayout
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class LegendLayout {

    /**
     * 主轴对齐方式
     * flex-start | flex-end | center
     * 默认值 flex-start
     */
    String justifyContent;


    /**
     * 交叉轴对齐
     * flex-start | flex-end | center
     * 默认值 flex-start
     */
    String alignItems;

    /**
     * 主轴方向
     * row | column
     * 默认值：position 为top和bottom的时候为row，其他时候为column	-
     */
    String flexDirection;

}