package com.muyun.vaadin.antd.charts.liquid;

import com.muyun.vaadin.antd.charts.common.BaseAntdChartsComponent;
import com.muyun.vaadin.antd.charts.common.option.ChartStyle;
import com.muyun.vaadin.antd.charts.liquid.event.LiquidReadyEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;


/**
 * Liquid
 *
 * @author muyun
 **/
@JsModule("./antd/charts/liquid/liquid.tsx")
@Tag("antd-charts-liquid")
public class Liquid extends BaseAntdChartsComponent<Liquid> {


    public Liquid() {
    }


    /**
     * 数据(0 ~ 1)
     **/
    public Double getPercent() {
        return getState("percent", Double.class);
    }

    /**
     * 数据(0 ~ 1)
     *
     * @param percent 默认值：-
     **/
    public Liquid setPercent(Number percent) {
        setState("percent", percent);
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
    public Liquid setTitle(String title) {
        setState("title", title);
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
    public Liquid setChartStyle(ChartStyle chartStyle) {
        setState("chartStyle", chartStyle);
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
    public Liquid setAnimate(String animate) {
        setState("animate", animate);
        return this;
    }


    /**
     * 视图好比一个画板，Liquid 组件默认在其上绘制了一个水波图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     **/
    public String getAnnotations() {
        return getState("annotations", String.class);
    }

    /**
     * 视图好比一个画板，Liquid 组件默认在其上绘制了一个水波图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     *
     * @param annotations 默认值：-
     **/
    public Liquid setAnnotations(String annotations) {
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
    public void addReadyListener(ComponentEventListener<LiquidReadyEvent> listener) {
        super.addListener(LiquidReadyEvent.class, listener);
    }


}