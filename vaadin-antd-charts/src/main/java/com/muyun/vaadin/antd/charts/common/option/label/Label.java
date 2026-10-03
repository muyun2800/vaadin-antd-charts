package com.muyun.vaadin.antd.charts.common.option.label;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * Ant Design Charts 中数据标签（Label） 是给图表添加标注的手段之一，对当前的一组数据进行的内容标注。包括数据点、连接线、文本数值等元素，根据不同的图表类型选择使用。
 * 通过简洁的文字说明，减少误解，使图表更易解读，并且强调关键数据或趋势，引导关注重要信息。
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Label {

    public Label() {
    }

    /**
     * label 标签 x 方向偏移，存在居中默认值 也可通过 style.dx 配置
     * 默认值：-
     **/
    private String dx;


    /**
     * label 标签 y 方向偏移，也可通过 style.dy 配置
     * 默认值：-
     **/
    private String dy;


    /**
     * label 标签偏移，也可通过 style.offset 配置
     * 默认值：-
     **/
    private String offset;


    /**
     * label 数据通道，类似 mark 标记的 x 通道，对应到文本元素上，可以用回调自定义 string 文本.
     * 默认值：-
     **/
    private String text;


    /**
     * 和 text 配置类似，同时配置 text 会失效，可以用回调自定义 string 文本或 HTMElement 复杂 html
     * 默认值：-
     **/
    private String innerHTML;


    /**
     * 标签文本格式化
     * 默认值：-
     **/
    private String formatter;


    /**
     * 和 innerHTML 配置类型一致
     * 默认值：-
     **/
    private String render;


    /**
     * 标签选择器，可以保留或隐藏标签。
     * 默认值：{type: 'cartesian' }
     **/
    private String selector;


    /**
     * 标签转换，用来优化标签的展示，解决标签重叠、颜色不明显的问题
     * 默认值：-
     **/
    private String transform;


    /**
     * 标签相对图形位置，并非标签方向。
     * 默认值：-
     **/
    private String position;


    /**
     * 标签样式配置
     * 默认值：-
     **/
    private LabelStyle style;


    /**
     * 是否展示背景颜色
     * 默认值：详见background
     **/
    private Boolean background;


    /**
     * 是否展示连接线 在 饼图和环形图等非笛卡尔坐标系下使用
     * 默认值：详见connector
     **/
    private Boolean connector;


}