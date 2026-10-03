package com.muyun.vaadin.antd.charts.common.option;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Ant Design Charts 中 Axis（坐标轴） 就像是图表的 "尺子"，用于建立数据与视觉位置的映射关系，
 * 并通过刻度、标签、网格线等元素帮助用户直观理解数据的分布与比例。它能帮你快速看懂图形的位置和数值大小。
 * 简单来说，坐标轴可以帮助我们把数据数字和图表上的位置对应起来，让图表更容易理解。
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Axis {


    // *****************************************************************************************************************
    //                                      title
    // *****************************************************************************************************************

    /**
     * 关闭标题或设置标题内容
     * 默认值：-
     **/
    // @Setter(AccessLevel.PRIVATE)
    private Object title;


    public Axis setTitle(String title) {
        this.title = title;
        return this;
    }

    public Axis setTitle(Boolean title) {
        this.title = title;
        return this;
    }


    /**
     * 标题到坐标轴的距离
     * 默认值：10
     **/
    private Number titleSpacing;


    /**
     * 标题相对坐标轴的位置，支持首字母简写形式，如'top'简写为't'
     * 默认值：'lb'
     **/
    private String titlePosition;


    /**
     * 标题文字大小
     * 默认值：-
     **/
    private Number titleFontSize;


    /**
     * 标题文字字体粗细
     * 默认值：-
     **/
    private Number titleFontWeight;


    /**
     * 标题文字字体
     * 默认值：-
     **/
    private String titleFontFamily;


    /**
     * 标题文字行高
     * 默认值：1
     **/
    private Number titleLineHeight;


    /**
     * 标题文字水平对齐方式
     * 默认值：'start'
     **/
    private String titleTextAlign;


    /**
     * 标题文字垂直基线
     * 默认值：'middle'
     **/
    private String titleTextBaseline;


    /**
     * 标题文字填充色
     * 默认值：-
     **/
    private String titleFill;


    /**
     * 标题填充透明度
     * 默认值：1
     **/
    private Number titleFillOpacity;


    /**
     * 标题描边颜色
     * 默认值：transparent
     **/
    private String titleStroke;


    /**
     * 标题描边透明度
     * 默认值：1
     **/
    private Number titleStrokeOpacity;


    /**
     * 标题文字描边宽度
     * 默认值：0
     **/
    private Number titleLineWidth;


    /**
     * 标题文字描边虚线配置
     * 默认值：[]
     **/
    private Number titleLineDash;


    /**
     * 标题文字整体透明度
     * 默认值：1
     **/
    private Number titleOpacity;


    /**
     * 标题文字阴影颜色
     * 默认值：transparent
     **/
    private String titleShadowColor;


    /**
     * 标题文字阴影高斯模糊系数
     * 默认值：0
     **/
    private Number titleShadowBlur;


    /**
     * 标题文字阴影水平偏移量
     * 默认值：0
     **/
    private Number titleShadowOffsetX;


    /**
     * 标题文字阴影垂直偏移量
     * 默认值：0
     **/
    private Number titleShadowOffsetY;


    /**
     * 标题文字鼠标样式
     * 默认值：default
     **/
    private String titleCursor;


    /**
     * 标题文字水平偏移量
     * 默认值：0
     **/
    private Number titleDx;


    /**
     * 标题文字垂直偏移量
     * 默认值：0
     **/
    private Number titleDy;

    // *****************************************************************************************************************
    //                                      line
    // *****************************************************************************************************************
    /**
     * 是否显示轴线
     * 默认值：false
     **/
    private Boolean line;


    /**
     * 是否显示箭头
     * 默认值：true
     **/
    private Boolean arrow;


    /**
     * 轴线两侧的延长线
     * 默认值：-
     **/
    private Number lineExtension;


    /**
     * 定义轴线箭头形状，默认为箭头形状
     * 默认值：-
     **/
    private String lineArrow;


    /**
     * 箭头偏移长度
     * 默认值：15
     **/
    private Number lineArrowOffset;


    /**
     * 箭头尺寸
     * 默认值：-
     **/
    private Number lineArrowSize;


    /**
     * 轴线描边宽度
     * 默认值：-
     **/
    private Number lineLineWidth;


    /**
     * 轴线描边虚线配置，第一个值为虚线每个分段的长度，第二个值为分段间隔的距离。lineDash 设为[0, 0]的效果为没有描边。
     * 默认值：-
     **/
    private Number lineLineDash;


    /**
     * 轴线整体透明度
     * 默认值：1
     **/
    private Number lineOpacity;


    /**
     * 轴线阴影颜色
     * 默认值：-
     **/
    private String lineShadowColor;


    /**
     * 轴线阴影高斯模糊系数
     * 默认值：-
     **/
    private Number lineShadowBlur;


    /**
     * 轴线阴影水平偏移量
     * 默认值：-
     **/
    private Number lineShadowOffsetX;


    /**
     * 轴线阴影垂直偏移量
     * 默认值：-
     **/
    private Number lineShadowOffsetY;


    /**
     * 轴线鼠标样式
     * 默认值：default
     **/
    private String lineCursor;


    // *****************************************************************************************************************
    //                                      tick
    // *****************************************************************************************************************
    /**
     * 是否显示刻度
     * 默认值：true
     **/
    private Boolean tick;


    /**
     * 设置推荐生成的刻度数量；tickCount 只是一个建议值
     * 默认值：-
     **/
    private Number tickCount;


    /**
     * 自定义刻度生成方法
     * 默认值：-
     **/
    private Number tickMethod;


    /**
     * 刻度线过滤
     * 默认值：-
     **/
    private Boolean tickFilter;


    /**
     * 刻度线格式化，可用于自定义刻度样式，回调函数中会额外返回该刻度的方向
     * 默认值：-
     **/
    private String tickFormatter;


    /**
     * 刻度朝向，为 positive 时，位于侧轴方向（即主轴顺时针 90 度方向）, 为 negative 时，刻度位于侧轴负方向
     * 默认值：positive
     **/
    private String tickDirection;


    /**
     * 刻度线长度
     * 默认值：15
     **/
    private Number tickLength;


    /**
     * 刻度线描边颜色
     * 默认值：-
     **/
    private String tickStroke;


    /**
     * 刻度线描边透明度
     * 默认值：-
     **/
    private Number tickStrokeOpacity;


    /**
     * 刻度线描边宽度
     * 默认值：-
     **/
    private Number tickLineWidth;


    /**
     * 刻度线描边虚线配置，第一个值为虚线每个分段的长度，第二个值为分段间隔的距离。lineDash 设为[0, 0]的效果为没有描边。
     * 默认值：-
     **/
    private Number tickLineDash;


    /**
     * 刻度线整体透明度
     * 默认值：-
     **/
    private Number tickOpacity;


    /**
     * 刻度线阴影颜色
     * 默认值：-
     **/
    private String tickShadowColor;


    /**
     * 刻度线阴影高斯模糊系数
     * 默认值：-
     **/
    private Number tickShadowBlur;


    /**
     * 刻度线阴影水平偏移量
     * 默认值：-
     **/
    private Number tickShadowOffsetX;


    /**
     * 刻度线阴影垂直偏移量
     * 默认值：-
     **/
    private Number tickShadowOffsetY;


    /**
     * 刻度线鼠标样式
     * 默认值：default
     **/
    private String tickCursor;


    // *****************************************************************************************************************
    //                                      label
    // *****************************************************************************************************************

    /**
     * 是否显示刻度值
     * 默认值：-
     **/
    private Boolean label;


    /**
     * 刻度标签文字大小
     * 默认值：-
     **/
    private Number labelFontSize;


    /**
     * 刻度标签文字字体
     * 默认值：-
     **/
    private Number labelFontFamily;


    /**
     * 刻度标签文字字体粗细
     * 默认值：-
     **/
    private Number labelFontWeight;


    /**
     * 刻度标签文字行高
     * 默认值：-
     **/
    private Number labelLineHeight;


    /**
     * 刻度标签文字水平对齐方式
     * 默认值：'start'
     **/
    private String labelTextAlign;


    /**
     * 刻度标签文字垂直基线
     * 默认值：'bottom'
     **/
    private String labelTextBaseline;


    /**
     * 刻度值对齐方式
     * - 'horizontal' 始终保持水平
     * - 'parallel' 平行于坐标轴
     * 'perpendicular' 垂直于坐标轴
     * 默认值：parallel
     **/
    private String labelAlign;


    /**
     * 刻度值过滤
     * 默认值：-
     **/
    private Boolean labelFilter;


    /**
     * 刻度值格式化，可以传入一个函数或者是 d3-format 支持的字符串
     * 默认值：-
     **/
    private String labelFormatter;


    /**
     * 自定义 label 渲染，支持 HtmlString，用法同 labelFormatter
     * 默认值：-
     **/
    private String labelRender;


    /**
     * 刻度值转换，避免文本之间发生重叠。当前支持超长文本缩略、重叠刻度值隐藏、自动旋转
     * 默认值：-
     **/
    private String transform;


    /**
     * 刻度值转换，在局部坐标系下进行变换的快捷方式，包括缩放、平移、旋转、拉伸、矩阵变换，具体见transform
     * 默认值：-
     **/
    private String labelTransform;


    /**
     * 自动隐藏重叠的刻度值，设置 size 值的时候生效
     * 默认值：-
     **/
    private Boolean labelAutoHide;


    /**
     * 自动旋转刻度，设置 size 值的时候生效值
     * 默认值：-
     **/
    private Boolean labelAutoRotate;


    /**
     * 自动缩略刻度值，设置 size 值的时候生效
     * 默认值：-
     **/
    private Boolean labelAutoEllipsis;


    /**
     * 自动换行刻度值，设置 size 值的时候是生效
     * 默认值：-
     **/
    private Boolean labelAutoWrap;


    /**
     * 刻度值位于轴线的位置，参考tickDirection
     * 默认值：positive
     **/
    private String labelDirection;


    /**
     * 刻度值到其对应刻度的间距
     * 默认值：0
     **/
    private Number labelSpacing;


    /**
     * 刻度标签文字填充色
     * 默认值：-
     **/
    private String labelFill;


    /**
     * 刻度标签文字填充透明度
     * 默认值：-
     **/
    private Number labelFillOpacity;


    /**
     * 刻度标签文字描边颜色
     * 默认值：-
     **/
    private String labelStroke;


    /**
     * 刻度标签文字描边透明度
     * 默认值：-
     **/
    private Number labelStrokeOpacity;


    /**
     * 刻度标签文字描边宽度
     * 默认值：-
     **/
    private Number labelLineWidth;


    /**
     * 刻度标签文字描边虚线配置，第一个值为虚线每个分段的长度，第二个值为分段间隔的距离。lineDash 设为[0, 0]的效果为没有描边。
     * 默认值：-
     **/
    private Number labelLineDash;


    /**
     * 刻度标签文字整体透明度
     * 默认值：-
     **/
    private Number labelOpacity;


    /**
     * 刻度标签文字阴影颜色
     * 默认值：-
     **/
    private String labelShadowColor;


    /**
     * 刻度标签文字阴影高斯模糊系数
     * 默认值：-
     **/
    private Number labelShadowBlur;


    /**
     * 刻度标签文字阴影水平偏移量
     * 默认值：-
     **/
    private Number labelShadowOffsetX;


    /**
     * 刻度标签文字阴影垂直偏移量
     * 默认值：-
     **/
    private Number labelShadowOffsetY;


    /**
     * 刻度标签文字鼠标样式
     * 默认值：default
     **/
    private String labelCursor;


    /**
     * 刻度标签文字水平偏移量
     * 默认值：0
     **/
    private Number labelDx;


    /**
     * 刻度标签文字垂直偏移量
     * 默认值：0
     **/
    private Number labelDy;


    // *****************************************************************************************************************
    //                                      grid
    // *****************************************************************************************************************

    /**
     * 是否显示网格线
     * 默认值：false
     **/
    private Boolean grid;


    /**
     * 网格线过滤
     * 默认值：-
     **/
    private Boolean gridFilter;


    /**
     * 网格线长度。一般情况下，不需要用户配置。
     * 默认值：0
     **/
    private Number gridLength;


    /**
     * 网格线区域填充色
     * 默认值：-
     **/
    private String gridAreaFill;


    /**
     * 网格线描边颜色
     * 默认值：-
     **/
    private String gridStroke;


    /**
     * 网格线描边透明度
     * 默认值：-
     **/
    private Number gridStrokeOpacity;


    /**
     * 网格线描边宽度
     * 默认值：-
     **/
    private Number gridLineWidth;


    /**
     * 网格线描边虚线配置，第一个值为虚线每个分段的长度，第二个值为分段间隔的距离。lineDash 设为[0, 0]的效果为没有描边。
     * 默认值：-
     **/
    private Number gridLineDash;


    /**
     * 网格线整体透明度
     * 默认值：-
     **/
    private Number gridOpacity;


    /**
     * 网格线阴影颜色
     * 默认值：-
     **/
    private String gridShadowColor;


    /**
     * 网格线阴影高斯模糊系数
     * 默认值：-
     **/
    private Number gridShadowBlur;


    /**
     * 网格线阴影水平偏移量
     * 默认值：-
     **/
    private Number gridShadowOffsetX;


    /**
     * 网格线阴影垂直偏移量
     * 默认值：-
     **/
    private Number gridShadowOffsetY;


    /**
     * 网格线鼠标样式
     * 默认值：default
     **/
    private String gridCursor;


    // *****************************************************************************************************************
    //                                      breaks
    // *****************************************************************************************************************

    /**
     * 断轴开始值
     * 默认值：-
     **/
    private Number start;


    /**
     * 断轴结束值
     * 默认值：-
     **/
    private Number end;


    /**
     * 断轴主轴方向区间占比，支持 0 ~ 1 和百分比两种类型
     * 默认值：-
     **/
    private Number gap;


    /**
     * 断轴起伏顶点数
     * 默认值：50
     **/
    private Number vertices;


    /**
     * 断轴振幅
     * 默认值：3
     **/
    private Number verticeOffset;


    /**
     * 断轴压缩方式，middle: 居中压缩，start: 起始值附近压缩，end：结束值附近压缩
     * 默认值：middle
     **/
    private String compress;


    /**
     * 断轴描边色
     * 默认值：#fff
     **/
    private String stroke;


    /**
     * 断轴填充色
     * 默认值：#aaa
     **/
    private String fill;


    /**
     * 断轴描边虚线样式
     * 默认值：2 2
     **/
    private String lineDash;


    // *****************************************************************************************************************
    //                                      animate
    // *****************************************************************************************************************
    /**
     * 是否开启动画
     * 默认值：-
     **/
    private Boolean animate;


}