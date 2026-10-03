package com.muyun.vaadin.antd.charts.line;

import com.muyun.vaadin.antd.charts.common.BaseAntdChartsComponent;
import com.muyun.vaadin.antd.charts.common.option.ChartStyle;
import com.muyun.vaadin.antd.charts.common.option.Point;
import com.muyun.vaadin.antd.charts.common.option.Scale;
import com.muyun.vaadin.antd.charts.common.option.Slider;
import com.muyun.vaadin.antd.charts.common.option.interaction.Interaction;
import com.muyun.vaadin.antd.charts.common.option.legend.Legend;
import com.muyun.vaadin.antd.charts.line.event.LineReadyEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

import java.util.Map;


/**
 * Line
 *
 * @author muyun
 **/
@JsModule("./antd/charts/line/line.tsx")
@Tag("antd-charts-line")
public class Line extends BaseAntdChartsComponent<Line> {

    public Line() {
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
    public Line setData(Object data) {
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
    public Line setXField(String xField) {
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
    public Line setYField(String yField) {
        setState("yField", yField);
        return this;
    }


    /**
     * 多折线图区分字段
     **/
    public String getSeriesField() {
        return getState("seriesField", String.class);
    }

    /**
     * 多折线图区分字段
     *
     * @param seriesField 默认值：-
     **/
    public Line setSeriesField(String seriesField) {
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
    public Line setColorField(String colorField) {
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
    public Line setShapeField(String shapeField) {
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
    public Line setSizeField(String sizeField) {
        setState("sizeField", sizeField);
        return this;
    }


    /**
     * 开启面积图，配置和面积图基本一致，默认继承了 Line 的 data | xField | yField 等属性，同时关闭了 tooltip，通过 style 指定绘图属性。
     **/
    public String getArea() {
        return getState("area", String.class);
    }

    /**
     * 开启面积图，配置和面积图基本一致，默认继承了 Line 的 data | xField | yField 等属性，同时关闭了 tooltip，通过 style 指定绘图属性。
     *
     * @param area 默认值：-
     **/
    public Line setArea(String area) {
        setState("area", area);
        return this;
    }


    /**
     * 标记，配置和 area 类似，也继承了上层的一些通用配置，通过 shapeField 指定标记类型, 可通过 sizeField 指定标记大小，可以通过 style 指定绘图属性。
     **/
    public Point getPoint() {
        return getState("point", Point.class);
    }

    /**
     * 标记，配置和 area 类似，也继承了上层的一些通用配置，通过 shapeField 指定标记类型, 可通过 sizeField 指定标记大小，可以通过 style 指定绘图属性。
     *
     * @param point 默认值：-
     **/
    public Line setPoint(Point point) {
        setState("point", point);
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
    public Line setTitle(String title) {
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
    public Line setAxis(Map<String, Object> axis) {
        setState("axis", axis);
        return this;
    }


    /**
     * 用于建立数据与视觉位置的映射关系。设置为 false，则不显示坐标轴。
     **/
    public Line setAxis(Boolean axis) {
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
    public Line setLegend(Map<String, Legend> legend) {
        setState("legend", legend);
        return this;
    }

    /**
     * 图表的辅助元素。设置为 false 则不显示图例
     **/
    public Line setLegend(Boolean legend) {
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
    public Line setScrollbar(String scrollbar) {
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
    public Line setSlider(Map<String, Slider> slider) {
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
    public Line setLabel(String label) {
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
    public Line setTooltip(String tooltip) {
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
    public Line setChartStyle(ChartStyle chartStyle) {
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
    public Line setTheme(String theme) {
        setState("theme", theme);
        return this;
    }


    /**
     * 将抽象数据映射为视觉数据，详见比例尺
     **/
    public Map<String, Scale> getScale() {
        return getState("scale", Map.class);
    }

    /**
     * 将抽象数据映射为视觉数据，详见比例尺
     *
     * @param scale 默认值：-
     **/
    public Line setScale(Map<String, Scale> scale) {
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
    public Line setAnimate(String animate) {
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
    public Line setInteraction(Interaction interaction) {
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
    public Line setState(String state) {
        setState("state", state);
        return this;
    }


    /**
     * 折线图是否堆叠
     **/
    public Boolean getStack() {
        return getState("stack", Boolean.class);
    }

    /**
     * 折线图是否堆叠
     *
     * @param stack 默认值：false
     **/
    public Line setStack(Boolean stack) {
        setState("stack", stack);
        return this;
    }


    /**
     * 视图好比一个画板，Line 组件默认在其上绘制了一个折线图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     **/
    public String getAnnotations() {
        return getState("annotations", String.class);
    }

    /**
     * 视图好比一个画板，Line 组件默认在其上绘制了一个折线图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     *
     * @param annotations 默认值：-
     **/
    public Line setAnnotations(String annotations) {
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
    public void addReadyListener(ComponentEventListener<LineReadyEvent> listener) {
        super.addListener(LineReadyEvent.class, listener);
    }


}