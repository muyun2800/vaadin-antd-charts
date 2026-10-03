package com.muyun.vaadin.antd.charts.pie;

import com.muyun.vaadin.antd.charts.common.BaseAntdChartsComponent;
import com.muyun.vaadin.antd.charts.common.option.ChartStyle;
import com.muyun.vaadin.antd.charts.common.option.label.Label;
import com.muyun.vaadin.antd.charts.pie.event.PieReadyEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;


//import com.muyun.vaadin.antd.charts.common.ReactStyle;


/**
 * Pie
 *
 * @author muyun
 **/
@JsModule("./antd/charts/pie/pie.tsx")
@Tag("antd-charts-pie")
public class Pie extends BaseAntdChartsComponent<Pie> {


    public Pie() {
    }


    /**
     * 数据
     **/
    public String getData() {
        return getState("data", String.class);
    }

    /**
     * 数据
     *
     * @param data 默认值：[]
     **/
    public Pie setData(Object data) {
        setState("data", data);
        return this;
    }


    /**
     * 角度映射字段
     **/
    public String getAngleField() {
        return getState("angleField", String.class);
    }

    /**
     * 角度映射字段
     *
     * @param angleField 默认值：-
     **/
    public Pie setAngleField(String angleField) {
        setState("angleField", angleField);
        return this;
    }


    /**
     * 颜色映射通道，详见color
     **/
    public String getColorField() {
        return getState("colorField", String.class);
    }

    /**
     * 颜色映射通道，详见color
     *
     * @param colorField 默认值：-
     **/
    public Pie setColorField(String colorField) {
        setState("colorField", colorField);
        return this;
    }


    /**
     * 半径
     **/
    public Double getRadius() {
        return getState("radius", Double.class);
    }

    /**
     * 半径
     *
     * @param radius 默认值：-
     **/
    public Pie setRadius(Number radius) {
        setState("radius", radius);
        return this;
    }


    /**
     * 内径
     **/
    public Double getInnerRadius() {
        return getState("innerRadius", Double.class);
    }

    /**
     * 内径
     *
     * @param innerRadius 默认值：0
     **/
    public Pie setInnerRadius(Number innerRadius) {
        setState("innerRadius", innerRadius);
        return this;
    }


    /**
     * 起始角度
     **/
    public Double getStartAngle() {
        return getState("startAngle", Double.class);
    }

    /**
     * 起始角度
     *
     * @param startAngle 默认值：-
     **/
    public Pie setStartAngle(Number startAngle) {
        setState("startAngle", startAngle);
        return this;
    }


    /**
     * 起始角度
     **/
    public Double getEndAngle() {
        return getState("endAngle", Double.class);
    }

    /**
     * 起始角度
     *
     * @param endAngle 默认值：-
     **/
    public Pie setEndAngle(Number endAngle) {
        setState("endAngle", endAngle);
        return this;
    }


    /**
     * 用于指定图表的标题内容，详见标题
     **/
    public String getTitle() {
        return getState("title", String.class);
    }

    /**
     * 用于指定图表的标题内容，详见标题
     *
     * @param title 默认值：-
     **/
    public Pie setTitle(String title) {
        setState("title", title);
        return this;
    }


    /**
     * 图表的辅助元素，使用颜色、大小、形状区分不同的数据类型，用于图表中数据的筛选，详见图例
     **/
    public String getLegend() {
        return getState("legend", String.class);
    }

    /**
     * 图表的辅助元素，使用颜色、大小、形状区分不同的数据类型，用于图表中数据的筛选，详见图例
     *
     * @param legend 默认值：-
     **/
    public Pie setLegend(String legend) {
        setState("legend", legend);
        return this;
    }


    /**
     * 数据标签是给图表添加标注的手段之一，详见标签
     **/
    public Label getLabel() {
        return getState("label", Label.class);
    }

    /**
     * 数据标签是给图表添加标注的手段之一，详见标签
     *
     * @param label 默认值：-
     **/
    public Pie setLabel(Label label) {
        setState("label", label);
        return this;
    }


    /**
     * 用于动态展示数据点的详细信息，详见提示
     **/
    public String getTooltip() {
        return getState("tooltip", String.class);
    }

    /**
     * 用于动态展示数据点的详细信息，详见提示
     *
     * @param tooltip 默认值：-
     **/
    public Pie setTooltip(String tooltip) {
        setState("tooltip", tooltip);
        return this;
    }


    /**
     * 视觉样式，配置项详见绘图属性
     **/
    public ChartStyle getChartStyle() {
        return getState("chartStyle", ChartStyle.class);
    }

    /**
     * 视觉样式，配置项详见绘图属性
     *
     * @param chartStyle 默认值：-
     **/
    public Pie setChartStyle(ChartStyle chartStyle) {
        setState("chartStyle", chartStyle);
        return this;
    }


    /**
     * 用于控制图表的整体外观，包括颜色、字体、边距等视觉属性，详见主题
     **/
    public String getTheme() {
        return getState("theme", String.class);
    }

    /**
     * 用于控制图表的整体外观，包括颜色、字体、边距等视觉属性，详见主题
     *
     * @param theme 默认值：light
     **/
    public Pie setTheme(String theme) {
        setState("theme", theme);
        return this;
    }


    /**
     * 将抽象数据映射为视觉数据，详见比例尺
     **/
    public String getScale() {
        return getState("scale", String.class);
    }

    /**
     * 将抽象数据映射为视觉数据，详见比例尺
     *
     * @param scale 默认值：-
     **/
    public Pie setScale(String scale) {
        setState("scale", scale);
        return this;
    }


    /**
     * 动画作为可视化的重要组成部分，能显著提高数据可视化的表现力，详见动画
     **/
    public String getAnimate() {
        return getState("animate", String.class);
    }

    /**
     * 动画作为可视化的重要组成部分，能显著提高数据可视化的表现力，详见动画
     *
     * @param animate 默认值：-
     **/
    public Pie setAnimate(String animate) {
        setState("animate", animate);
        return this;
    }


    /**
     * 提供了按需探索数据的能力，详见交互
     **/
    public String getInteraction() {
        return getState("interaction", String.class);
    }

    /**
     * 提供了按需探索数据的能力，详见交互
     *
     * @param interaction 默认值：-
     **/
    public Pie setInteraction(String interaction) {
        setState("interaction", interaction);
        return this;
    }


    /**
     * 实现交互反馈、高亮、选中等效果，详见状态，不同交互下图表样式
     **/
    public String getState() {
        return getState("state", String.class);
    }

    /**
     * 实现交互反馈、高亮、选中等效果，详见状态，不同交互下图表样式
     *
     * @param state 默认值：-
     **/
    public Pie setState(String state) {
        setState("state", state);
        return this;
    }


    /**
     * 视图好比一个画板，Column 组件默认在其上绘制了一个饼图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     **/
    public String getAnnotations() {
        return getState("annotations", String.class);
    }

    /**
     * 视图好比一个画板，Column 组件默认在其上绘制了一个饼图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     *
     * @param annotations 默认值：-
     **/
    public Pie setAnnotations(String annotations) {
        setState("annotations", annotations);
        return this;
    }


    // *****************************************************************************************************************
    // ********************************************** ReactNode 相关 ****************************************************
    // *****************************************************************************************************************

    // *****************************************************************************************************************
    // ********************************************** 事件相关 ***********************************************************
    // *****************************************************************************************************************

    /**
     * @param listener
     */
    public void addReadyListener(ComponentEventListener<PieReadyEvent> listener) {
        super.addListener(PieReadyEvent.class, listener);
    }


}