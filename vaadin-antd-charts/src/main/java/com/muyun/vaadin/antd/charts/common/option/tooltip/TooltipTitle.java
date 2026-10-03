package com.muyun.vaadin.antd.charts.common.option.tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * TooltipTitle
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class TooltipTitle {
    /**
     * 定义生成 title 的通道
     */
    private String channel;


    /**
     * 定义生成 title 的的字段
     */
    String field;

    /**
     * title 的值
     */
    String value;
    /**
     * 格式化 title
     */
    String valueFormatter;
}