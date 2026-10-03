package com.muyun.vaadin.antd.charts.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class ViewStyle {

    public ViewStyle() {
    }

    /**
     * 图表的视图区域的四个圆角半径大小
     * 默认值：0
     **/
    private Number viewRadius;


    /**
     * 图表的视图区域填充颜色
     * 默认值：-
     **/
    private String viewFill;


    /**
     * 图表的视图区域填充透明度
     * 默认值：-
     **/
    private Number viewFillOpacity;


    /**
     * 图表的视图区域描边颜色
     * 默认值：-
     **/
    private String viewStroke;


    /**
     * 图表的视图区域描边透明度
     * 默认值：-
     **/
    private Number viewStrokeOpacity;


    /**
     * 图表的视图区域描边宽度
     * 默认值：-
     **/
    private Number viewLineWidth;


    /**
     * 图表的视图区域描边虚线配置
     * 默认值：-
     **/
    private Number viewLineDash;


    /**
     * 图表的视图区域整体透明度
     * 默认值：-
     **/
    private Number viewOpacity;


    /**
     * 图表的视图区域阴影颜色
     * 默认值：-
     **/
    private String viewShadowColor;


    /**
     * 图表的视图区域阴影模糊系数
     * 默认值：-
     **/
    private Number viewShadowBlur;


    /**
     * 图表的视图区域阴影水平偏移
     * 默认值：-
     **/
    private Number viewShadowOffsetX;


    /**
     * 图表的视图区域阴影垂直偏移
     * 默认值：-
     **/
    private Number viewShadowOffsetY;


    /**
     * 图表的视图区域鼠标样式
     * 默认值：default
     **/
    private String viewCursor;


    /**
     * 图表的绘制区域的四个圆角半径大小
     * 默认值：0
     **/
    private Number plotRadius;


    /**
     * 图表的绘制区域填充颜色
     * 默认值：-
     **/
    private String plotFill;


    /**
     * 图表的绘制区域填充透明度
     * 默认值：-
     **/
    private Number plotFillOpacity;


    /**
     * 图表的绘制区域描边颜色
     * 默认值：-
     **/
    private String plotStroke;


    /**
     * 图表的绘制区域描边透明度
     * 默认值：-
     **/
    private Number plotStrokeOpacity;


    /**
     * 图表的绘制区域描边宽度
     * 默认值：-
     **/
    private Number plotLineWidth;


    /**
     * 图表的绘制区域描边虚线配置
     * 默认值：-
     **/
    private Number plotLineDash;


    /**
     * 图表的绘制区域整体透明度
     * 默认值：-
     **/
    private Number plotOpacity;


    /**
     * 图表的绘制区域阴影颜色
     * 默认值：-
     **/
    private String plotShadowColor;


    /**
     * 图表的绘制区域阴影模糊系数
     * 默认值：-
     **/
    private Number plotShadowBlur;


    /**
     * 图表的绘制区域阴影水平偏移
     * 默认值：-
     **/
    private Number plotShadowOffsetX;


    /**
     * 图表的绘制区域阴影垂直偏移
     * 默认值：-
     **/
    private Number plotShadowOffsetY;


    /**
     * 图表的绘制区域鼠标样式
     * 默认值：default
     **/
    private String plotCursor;


    /**
     * 图表的主区域的四个圆角半径大小
     * 默认值：0
     **/
    private Number mainRadius;


    /**
     * 图表的主区域填充颜色
     * 默认值：-
     **/
    private String mainFill;


    /**
     * 图表的主区域填充透明度
     * 默认值：-
     **/
    private Number mainFillOpacity;


    /**
     * 图表的主区域描边颜色
     * 默认值：-
     **/
    private String mainStroke;


    /**
     * 图表的主区域描边透明度
     * 默认值：-
     **/
    private Number mainStrokeOpacity;


    /**
     * 图表的主区域描边宽度
     * 默认值：-
     **/
    private Number mainLineWidth;


    /**
     * 图表的主区域描边虚线配置
     * 默认值：-
     **/
    private Number mainLineDash;


    /**
     * 图表的主区域整体透明度
     * 默认值：-
     **/
    private Number mainOpacity;


    /**
     * 图表的主区域阴影颜色
     * 默认值：-
     **/
    private String mainShadowColor;


    /**
     * 图表的主区域阴影模糊系数
     * 默认值：-
     **/
    private Number mainShadowBlur;


    /**
     * 图表的主区域阴影水平偏移
     * 默认值：-
     **/
    private Number mainShadowOffsetX;


    /**
     * 图表的主区域阴影垂直偏移
     * 默认值：-
     **/
    private Number mainShadowOffsetY;


    /**
     * 图表的主区域鼠标样式
     * 默认值：default
     **/
    private String mainCursor;


    /**
     * 图表的内容区域的四个圆角半径大小
     * 默认值：0
     **/
    private Number contentRadius;


    /**
     * 图表的内容区域填充颜色
     * 默认值：-
     **/
    private String contentFill;


    /**
     * 图表的内容区域填充透明度
     * 默认值：-
     **/
    private Number contentFillOpacity;


    /**
     * 图表的内容区域描边颜色
     * 默认值：-
     **/
    private String contentStroke;


    /**
     * 图表的内容区域描边透明度
     * 默认值：-
     **/
    private Number contentStrokeOpacity;


    /**
     * 图表的内容区域描边宽度
     * 默认值：-
     **/
    private Number contentLineWidth;


    /**
     * 图表的内容区域描边虚线配置
     * 默认值：-
     **/
    private Number contentLineDash;


    /**
     * 图表的内容区域整体透明度
     * 默认值：-
     **/
    private Number contentOpacity;


    /**
     * 图表的内容区域阴影颜色
     * 默认值：-
     **/
    private String contentShadowColor;


    /**
     * 图表的内容区域阴影模糊系数
     * 默认值：-
     **/
    private Number contentShadowBlur;


    /**
     * 图表的内容区域阴影水平偏移
     * 默认值：-
     **/
    private Number contentShadowOffsetX;


    /**
     * 图表的内容区域阴影垂直偏移
     * 默认值：-
     **/
    private Number contentShadowOffsetY;


    /**
     * 图表的内容区域鼠标样式
     * 默认值：default
     **/
    private String contentCursor;


}