package com.muyun.vaadin.antd.charts.column;

import com.muyun.vaadin.antd.charts.column.event.ColumnReadyEvent;
import com.muyun.vaadin.antd.charts.common.BaseAntdChartsComponent;
import com.muyun.vaadin.antd.charts.common.option.ChartStyle;
import com.muyun.vaadin.antd.charts.common.option.Slider;
import com.muyun.vaadin.antd.charts.common.option.tooltip.Tooltip;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

import java.util.Map;

/**
 * Column
 *
 * @author muyun
 **/
@JsModule("./antd/charts/column/column.tsx")
@Tag("antd-charts-column")
public class Column extends BaseAntdChartsComponent<Column> {

    public Column() {
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
    public Column setData(Object data) {
        setState("data", data);
        return this;
    }


    /**
     * 横轴字段
     **/
    public String getXField() {
        return getState("xField", String.class);
    }

    /**
     * 横轴字段
     *
     * @param xField 默认值：-
     **/
    public Column setXField(String xField) {
        setState("xField", xField);
        return this;
    }


    /**
     * 纵轴字段
     **/
    public String getYField() {
        return getState("yField", String.class);
    }

    /**
     * 纵轴字段
     *
     * @param yField 默认值：-
     **/
    public Column setYField(String yField) {
        setState("yField", yField);
        return this;
    }


    /**
     * 多柱状图区分字段
     **/
    public String getSeriesField() {
        return getState("seriesField", String.class);
    }

    /**
     * 多柱状图区分字段
     *
     * @param seriesField 默认值：-
     **/
    public Column setSeriesField(String seriesField) {
        setState("seriesField", seriesField);
        return this;
    }


    /**
     * 和 seriesField 类似，不过会加上颜色通道，详见color
     **/
    public String getColorField() {
        return getState("colorField", String.class);
    }

    /**
     * 和 seriesField 类似，不过会加上颜色通道，详见color
     *
     * @param colorField 默认值：-
     **/
    public Column setColorField(String colorField) {
        setState("colorField", colorField);
        return this;
    }


    /**
     * 柱状图是否堆叠
     **/
    public Boolean getStack() {
        return getState("stack", Boolean.class);
    }

    /**
     * 柱状图是否堆叠
     *
     * @param stack 默认值：false
     **/
    public Column setStack(Boolean stack) {
        setState("stack", stack);
        return this;
    }


    /**
     * 柱状图是否分组
     **/
    public Boolean getGroup() {
        return getState("group", Boolean.class);
    }

    /**
     * 柱状图是否分组
     *
     * @param group 默认值：false
     **/
    public Column setGroup(Boolean group) {
        setState("group", group);
        return this;
    }


    /**
     * 堆叠状态下柱状图是否百分比展示
     **/
    public Boolean getPercent() {
        return getState("percent", Boolean.class);
    }

    /**
     * 堆叠状态下柱状图是否百分比展示
     *
     * @param percent 默认值：false
     **/
    public Column setPercent(Boolean percent) {
        setState("percent", percent);
        return this;
    }


    /**
     * 转化率配置
     **/
    public String getConversionTag() {
        return getState("conversionTag", String.class);
    }

    /**
     * 转化率配置
     *
     * @param conversionTag 默认值：-
     **/
    public Column setConversionTag(String conversionTag) {
        setState("conversionTag", conversionTag);
        return this;
    }


    /**
     * 元素背景配置，和配置柱子无区别，可以看做是放置于底层的 Column 组件，需要配置 scale.y.domain 才能生效
     **/
    public String getMarkBackground() {
        return getState("markBackground", String.class);
    }

    /**
     * 元素背景配置，和配置柱子无区别，可以看做是放置于底层的 Column 组件，需要配置 scale.y.domain 才能生效
     *
     * @param markBackground 默认值：-
     **/
    public Column setMarkBackground(String markBackground) {
        setState("markBackground", markBackground);
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
    public Column setTitle(String title) {
        setState("title", title);
        return this;
    }


    /**
     * 用于建立数据与视觉位置的映射关系，详见坐标轴
     *
     * @param axis 默认值：-
     **/
    public Column setAxis(Map<String, Object> axis) {
        setState("axis", axis);
        return this;
    }


    /**
     * 用于建立数据与视觉位置的映射关系。设置为 false，则不显示坐标轴。
     **/
    public Column setAxis(Boolean axis) {
        setState("axis", axis);
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
    public Column setLegend(String legend) {
        setState("legend", legend);
        return this;
    }

    public Column setLegend(Boolean legend) {
        setState("legend", legend);
        return this;
    }


    /**
     * 用于过滤数据，可以和 x 或者 y 通道绑定，详见滚动条
     **/
    public String getScrollbar() {
        return getState("scrollbar", String.class);
    }

    /**
     * 用于过滤数据，可以和 x 或者 y 通道绑定，详见滚动条
     *
     * @param scrollbar 默认值：-
     **/
    public Column setScrollbar(String scrollbar) {
        setState("scrollbar", scrollbar);
        return this;
    }


    /**
     * 用于过滤数据，让用户在数据量较大的情况下一次只用关注局部的数据，是一种辅助看数据的组件，详见滑块
     **/
    public String getSlider() {
        return getState("slider", String.class);
    }

    /**
     * 用于过滤数据，让用户在数据量较大的情况下一次只用关注局部的数据，是一种辅助看数据的组件，详见滑块
     *
     * @param slider 默认值：-
     **/
    public Column setSlider(Map<String, Slider> slider) {
        setState("slider", slider);
        return this;
    }


    /**
     * 数据标签是给图表添加标注的手段之一，详见标签
     **/
    public String getLabel() {
        return getState("label", String.class);
    }

    /**
     * 数据标签是给图表添加标注的手段之一，详见标签
     *
     * @param label 默认值：-
     **/
    public Column setLabel(String label) {
        setState("label", label);
        return this;
    }


    /**
     * 用于动态展示数据点的详细信息，详见提示
     **/
    public Tooltip getTooltip() {
        return getState("tooltip", Tooltip.class);
    }

    /**
     * 用于动态展示数据点的详细信息，详见提示
     *
     * @param tooltip 默认值：-
     **/
    public Column setTooltip(Tooltip tooltip) {
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
    public Column setChartStyle(ChartStyle chartStyle) {
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
    public Column setTheme(String theme) {
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
    public Column setScale(String scale) {
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
    public Column setAnimate(String animate) {
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
    public Column setInteraction(String interaction) {
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
    public Column setState(String state) {
        setState("state", state);
        return this;
    }


    /**
     * 视图好比一个画板，Column 组件默认在其上绘制了一个柱状图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     **/
    public String getAnnotations() {
        return getState("annotations", String.class);
    }

    /**
     * 视图好比一个画板，Column 组件默认在其上绘制了一个柱状图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     *
     * @param annotations 默认值：-
     **/
    public Column setAnnotations(String annotations) {
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
    public void addReadyListener(ComponentEventListener<ColumnReadyEvent> listener) {
        super.addListener(ColumnReadyEvent.class, listener);
    }


}