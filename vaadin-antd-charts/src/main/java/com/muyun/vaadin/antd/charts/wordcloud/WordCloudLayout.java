package com.muyun.vaadin.antd.charts.wordcloud;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class WordCloudLayout {

    public WordCloudLayout() {
    }

    /**
     * 设置字体样式，可以是字符串或函数，函数根据单词返回字体，修改 d3 词云配置
     * 默认值：'Impact'
     **/
    private String font;


    /**
     * 设置字体大小，可以是具体值、范围 [min, max] 或函数，修改 d3 词云配置
     * 默认值：-
     **/
    private Number[] fontSize;


    /**
     * 设置图像作为单词布局的遮罩，可以是 HTML 图像元素或图像路径字符串
     * 默认值：-
     **/
    private String imageMask;


    /**
     * 配置事件监听器函数，可以监听布局完成 (end) 或单词更新 (word)
     * 默认值：-
     **/
    private String on;


    /**
     * 设置单词之间的间距，单位为像素，可以是具体值或动态函数
     * 默认值：2
     **/
    private Number padding;


    /**
     * 设置单词的旋转角度，可以是具体值或动态函数
     * 默认值：() => (~~(Math.random() * 6) - 3) * 30
     **/
    private Number rotate;


    /**
     * 设置随机数生成器，可以是具体数值或函数
     * 默认值：-
     **/
    private Number random;


    /**
     * 设置布局的矩形宽度和高度，格式为 [width, height]
     * 默认值：[20, 60]
     **/
    private Number size;


    /**
     * 设置单词的排布模式，可以选择 "archimedean" 或 "rectangular" 内置螺旋类型，也可以通过函数实现自定义
     * 默认值：-
     **/
    private String spiral;


    /**
     * 设置布局算法的时间间隔，控制运行时间
     * 默认值：-
     **/
    private Number timeInterval;


}