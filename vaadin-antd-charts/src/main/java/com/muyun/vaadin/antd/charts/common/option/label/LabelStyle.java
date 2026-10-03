package com.muyun.vaadin.antd.charts.common.option.label;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class LabelStyle {

    public LabelStyle() {
    }

    // *****************************************************************************************************************
    //                                      文本样式
    // *****************************************************************************************************************
    /**
     * 文字大小
     * 默认值：-
     **/
    private Number fontSize;


    /**
     * 文字字体
     * 默认值：-
     **/
    private String fontFamily;


    /**
     * 字体粗细
     * 默认值：-
     **/
    private String fontWeight;


    /**
     * 文字的行高
     * 默认值：-
     **/
    private Number lineHeight;


    /**
     * 设置文本内容的当前对齐方式, 支持的属性：center | end | left | right | start，默认值为start
     * 默认值：-
     **/
    private String textAlign;


    /**
     * 设置在绘制文本时使用的当前文本基线, 支持的属性:top | middle | bottom | alphabetic | hanging。默认值为bottom
     * 默认值：-
     **/
    private String textBaseline;


    /**
     * 图形的填充色
     * 默认值：-
     **/
    private String fill;


    /**
     * 图形的填充透明度
     * 默认值：-
     **/
    private Number fillOpacity;


    /**
     * 图形的描边
     * 默认值：-
     **/
    private String stroke;


    /**
     * 描边透明度
     * 默认值：-
     **/
    private Number strokeOpacity;


    /**
     * 图形描边的宽度
     * 默认值：-
     **/
    private Number lineWidth;


    /**
     * 描边的虚线配置，第一个值为虚线每个分段的长度，第二个值为分段间隔的距离。lineDash 设为[0, 0]的效果为没有描边。
     * 默认值：-
     **/
    private Number lineDash;


    /**
     * 图形的整体透明度
     * 默认值：-
     **/
    private Number opacity;


    /**
     * 图形阴影颜色
     * 默认值：-
     **/
    private String shadowColor;


    /**
     * 图形阴影的高斯模糊系数
     * 默认值：-
     **/
    private Number shadowBlur;


    /**
     * 设置阴影距图形的水平距离
     * 默认值：-
     **/
    private Number shadowOffsetX;


    /**
     * 设置阴影距图形的垂直距离
     * 默认值：-
     **/
    private Number shadowOffsetY;


    /**
     * 鼠标样式。同 css 的鼠标样式，默认 'default'。
     * 默认值：default
     **/
    private String cursor;


    // *****************************************************************************************************************
    //                                     、connector 连接线样式
    // *****************************************************************************************************************

    /**
     * 连接线描边色
     * 默认值：-
     **/
    private String connectorStroke;


    /**
     * 连接线描边线宽
     * 默认值：-
     **/
    private Number connectorLineWidth;


    /**
     * 连接线描边的虚线配置
     * 默认值：-
     **/
    private Number connectorLineDash;


    /**
     * 连接线描边透明度
     * 默认值：-
     **/
    private Number connectorOpacity;


    /**
     * 连接线和文本的间距
     * 默认值：-
     **/
    private Number connectorDistance;

    // *****************************************************************************************************************
    //                                      background 背景样式
    // *****************************************************************************************************************


    /**
     * 背景框填充色
     * 默认值：-
     **/
    private String backgroundFill;


    /**
     * 背景框圆角半径
     * 默认值：-
     **/
    private Number backgroundRadius;


    /**
     * 背景框内间距
     * 默认值：-
     **/
    private Number backgroundPadding;


    /**
     * 背景描边颜色
     * 默认值：-
     **/
    private String backgroundStroke;


    /**
     * 背景描边虚线配置
     * 默认值：-
     **/
    private Number backgroundLineDash;


    /**
     * 背景描边宽度
     * 默认值：-
     **/
    private Number backgroundLineWidth;


}