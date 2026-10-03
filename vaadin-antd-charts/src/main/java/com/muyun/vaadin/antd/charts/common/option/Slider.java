package com.muyun.vaadin.antd.charts.common.option;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Slider {

    public Slider() {
    }

    /**
     * 缩略轴内边距
     * 默认值：-
     **/
    private Number padding;


    /**
     * 缩略轴初始选区范围，位于 0 ～ 1 区间
     * 默认值：-
     **/
    private Number values;


    /**
     * 是否允许拖动选取和手柄
     * 默认值：true
     **/
    private Boolean slidable;


    /**
     * 是否启用刷选
     * 默认值：true
     **/
    private Boolean brushable;


    /**
     * 缩略轴拖动手柄标签格式化
     * 默认值：-
     **/
    private Double labelFormatter;


    /**
     * 是否显示拖动手柄
     * 默认值：true
     **/
    private Boolean showHandle;


    /**
     * 是否显示拖动手柄文本
     * 默认值：true
     **/
    private Boolean showLabel;


    /**
     * 在调整手柄或刷选时才显示手柄文本，在 showLabel 为 false 时生效
     * 默认值：false
     **/
    private Boolean showLabelOnInteraction;


    /**
     * 是否自动调整拖动手柄文本位置
     * 默认值：true
     **/
    private Boolean autoFitLabel;


    /**
     * 配置缩略轴组件的样式
     * 默认值：详见 style
     **/
    private String style;


}