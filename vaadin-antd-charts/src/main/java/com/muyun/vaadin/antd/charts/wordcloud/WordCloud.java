package com.muyun.vaadin.antd.charts.wordcloud;

import com.muyun.vaadin.antd.charts.common.BaseAntdChartsComponent;
import com.muyun.vaadin.antd.charts.common.option.ChartStyle;
import com.muyun.vaadin.antd.charts.wordcloud.event.WordCloudReadyEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;


/**
 * WordCloud
 *
 * @author muyun
 **/
@JsModule("./antd/charts/wordcloud/word-cloud.tsx")
@Tag("antd-charts-word-cloud")
public class WordCloud extends BaseAntdChartsComponent<WordCloud> {


    public WordCloud() {
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
    public WordCloud setData(Object data) {
        setState("data", data);
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
    public WordCloud setColorField(String colorField) {
        setState("colorField", colorField);
        return this;
    }


    /**
     * 设置单词的文本访问器函数，用来根据单词数据返回单词文本
     **/
    public String getTextField() {
        return getState("textField", String.class);
    }

    /**
     * 设置单词的文本访问器函数，用来根据单词数据返回单词文本
     *
     * @param textField 默认值：-
     **/
    public WordCloud setTextField(String textField) {
        setState("textField", textField);
        return this;
    }


    /**
     * 配置 wordCloud 布局，包括 padding、rotate 等
     **/
    public WordCloudLayout getLayout() {
        return getState("layout", WordCloudLayout.class);
    }

    /**
     * 配置 wordCloud 布局，包括 padding、rotate 等
     *
     * @param layout 默认值：-
     **/
    public WordCloud setLayout(WordCloudLayout layout) {
        setState("layout", layout);
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
    public WordCloud setTitle(String title) {
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
    public WordCloud setLegend(String legend) {
        setState("legend", legend);
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
    public WordCloud setLabel(String label) {
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
    public WordCloud setTooltip(String tooltip) {
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
    public WordCloud setChartStyle(ChartStyle chartStyle) {
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
    public WordCloud setTheme(String theme) {
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
    public WordCloud setScale(String scale) {
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
    public WordCloud setAnimate(String animate) {
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
    public WordCloud setInteraction(String interaction) {
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
    public WordCloud setState(String state) {
        setState("state", state);
        return this;
    }


    /**
     * 视图好比一个画板，WordCloud 组件默认在其上绘制了一个词云图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     **/
    public String getAnnotations() {
        return getState("annotations", String.class);
    }

    /**
     * 视图好比一个画板，WordCloud 组件默认在其上绘制了一个词云图，我们可以通过 annotations 在上面叠加更多的图层，详见标注
     *
     * @param annotations 默认值：-
     **/
    public WordCloud setAnnotations(String annotations) {
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
    public void addReadyListener(ComponentEventListener<WordCloudReadyEvent> listener) {
        super.addListener(WordCloudReadyEvent.class, listener);
    }


}