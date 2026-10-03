package com.muyun.vaadin.antd.charts.area;

import com.muyun.vaadin.antd.charts.area.event.AreaReadyEvent;
import com.muyun.vaadin.antd.charts.common.BaseAntdChartsComponent;
import com.muyun.vaadin.antd.charts.common.option.ChartStyle;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;


/**
 * Area
 *
 * @author muyun
 **/
@JsModule("./antd/charts/area/area.tsx")
@Tag("antd-charts-area")


public class Area extends BaseAntdChartsComponent<Area> {


    public Area() {
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
    public Area setData(Object data) {
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
    public Area setXField(String xField) {
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
    public Area setYField(String yField) {
        setState("yField", yField);
        return this;
    }


    /**
     * 多面积图区分字段
     **/
    public String getSeriesField() {
        return getState("seriesField", String.class);
    }

    /**
     * 多面积图区分字段
     *
     * @param seriesField 默认值：-
     **/
    public Area setSeriesField(String seriesField) {
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
    public Area setColorField(String colorField) {
        setState("colorField", colorField);
        return this;
    }


    /**
     * 绑定 line 标记的 shape 属性通道，改变图形标记的绘制形状
     **/
    public String getShapeField() {
        return getState("shapeField", String.class);
    }

    /**
     * 绑定 line 标记的 shape 属性通道，改变图形标记的绘制形状
     *
     * @param shapeField 默认值：line
     **/
    public Area setShapeField(String shapeField) {
        setState("shapeField", shapeField);
        return this;
    }


    /**
     * 绑定 line 标记的 size 属性通道，改变图形标记的大小， 对于折线来说，size 视觉通道映射在线的宽度上
     **/
    public String getSizeField() {
        return getState("sizeField", String.class);
    }

    /**
     * 绑定 line 标记的 size 属性通道，改变图形标记的大小， 对于折线来说，size 视觉通道映射在线的宽度上
     *
     * @param sizeField 默认值：-
     **/
    public Area setSizeField(String sizeField) {
        setState("sizeField", sizeField);
        return this;
    }


    /**
     * 开启折线图，配置和折线图基本一致，默认继承了 Area 的 data | xField | yField 等属性，同时关闭了 tooltip，通过 style 指定绘图属性。
     **/
    public String getLine() {
        return getState("line", String.class);
    }

    /**
     * 开启折线图，配置和折线图基本一致，默认继承了 Area 的 data | xField | yField 等属性，同时关闭了 tooltip，通过 style 指定绘图属性。
     *
     * @param line 默认值：-
     **/
    public Area setLine(String line) {
        setState("line", line);
        return this;
    }


    /**
     * 标记，配置和 line 类似，也继承了上层的一些通用配置，通过 shapeField 指定标记类型, 可通过 sizeField 指定标记大小，可以通过 style 指定绘图属性。
     **/
    public String getPoint() {
        return getState("point", String.class);
    }

    /**
     * 标记，配置和 line 类似，也继承了上层的一些通用配置，通过 shapeField 指定标记类型, 可通过 sizeField 指定标记大小，可以通过 style 指定绘图属性。
     *
     * @param point 默认值：-
     **/
    public Area setPoint(String point) {
        setState("point", point);
        return this;
    }


    /**
     * 面积图是否堆叠
     **/
    public Boolean getStack() {
        return getState("stack", Boolean.class);
    }

    /**
     * 面积图是否堆叠
     *
     * @param stack 默认值：false
     **/
    public Area setStack(Boolean stack) {
        setState("stack", stack);
        return this;
    }


    /**
     * 堆叠状态下条形图是否百分比展示
     **/
    public Boolean getPercent() {
        return getState("percent", Boolean.class);
    }

    /**
     * 堆叠状态下条形图是否百分比展示
     *
     * @param percent 默认值：false
     **/
    public Area setPercent(Boolean percent) {
        setState("percent", percent);
        return this;
    }


    /**
     * 数据是否围绕 Y 轴对称分布，展示正负关联（如收益与亏损、进出口平衡）
     **/
    public Boolean getSymmetry() {
        return getState("symmetry", Boolean.class);
    }

    /**
     * 数据是否围绕 Y 轴对称分布，展示正负关联（如收益与亏损、进出口平衡）
     *
     * @param symmetry 默认值：false
     **/
    public Area setSymmetry(Boolean symmetry) {
        setState("symmetry", symmetry);
        return this;
    }


    /**
     * 是否开启差分
     **/
    public Boolean getDiff() {
        return getState("diff", Boolean.class);
    }

    /**
     * 是否开启差分
     *
     * @param diff 默认值：false
     **/
    public Area setDiff(Boolean diff) {
        setState("diff", diff);
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
    public Area setTitle(String title) {
        setState("title", title);
        return this;
    }


    /**
     * 用于建立数据与视觉位置的映射关系，详见坐标轴
     **/
    public String getAxis() {
        return getState("axis", String.class);
    }

    /**
     * 用于建立数据与视觉位置的映射关系，详见坐标轴
     *
     * @param axis 默认值：-
     **/
    public Area setAxis(String axis) {
        setState("axis", axis);
        return this;
    }

    /**
     * 用于建立数据与视觉位置的映射关系，详见坐标轴
     *
     * @param axis 默认值：-
     **/
    public Area setAxis(Boolean axis) {
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
    public Area setLegend(String legend) {
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
    public Area setScrollbar(String scrollbar) {
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
    public Area setSlider(String slider) {
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
    public Area setLabel(String label) {
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
    public Area setTooltip(String tooltip) {
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
    public Area setChartStyle(ChartStyle chartStyle) {
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
    public Area setTheme(String theme) {
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
    public Area setScale(String scale) {
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
    public Area setAnimate(String animate) {
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
    public Area setInteraction(String interaction) {
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
    public Area setState(String state) {
        setState("state", state);
        return this;
    }


    /**
     * 视图好比一个画板，Line 组件默认在其上绘制了一个面积图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     **/
    public String getAnnotations() {
        return getState("annotations", String.class);
    }

    /**
     * 视图好比一个画板，Line 组件默认在其上绘制了一个面积图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     *
     * @param annotations 默认值：-
     **/
    public Area setAnnotations(String annotations) {
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
    public void addReadyListener(ComponentEventListener<AreaReadyEvent> listener) {
        super.addListener(AreaReadyEvent.class, listener);
    }


}