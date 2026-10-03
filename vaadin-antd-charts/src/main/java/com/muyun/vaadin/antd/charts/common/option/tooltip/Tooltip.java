package com.muyun.vaadin.antd.charts.common.option.tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Tooltip {

    public Tooltip() {
    }

    /**
     * 设置tooltip的标题内容：如果值为数据字段名，则会展示数据中对应该字段的数值，如果数据中不存在该字段，将该值作为 title。详见title 配置
     * 默认值：
     **/
    private Object title;

    public Tooltip setTitle(String title) {
        this.title = title;
        return this;
    }


    public Tooltip setTitle(TooltipTitle title) {
        this.title = title;
        return this;
    }

    /**
     * 设置复合图形tooltip标题的节点title属性
     * 默认值：
     *
     * @since 桑基图等复合图形
     **/
    private String nodeTitle;


    /**
     * 设置复合图形tooltip标题的弦title属性
     * 默认值：
     *
     * @since 桑基图等复合图形
     **/
    private String linkTitle;


    /**
     * 指定tooltip中显示的字段，默认不同图表有不同的默认字段列表。配合 channel 配置一起使用，效果更佳。详见items 配置
     * 默认值：
     **/
    private String items;


    /**
     * 设置复合图形tooltip标题的节点items属性
     * 默认值：
     *
     * @since 桑基图等复合图形
     **/
    private String nodeItems;


    /**
     * 设置复合图形tooltip标题的弦items属性
     * 默认值：
     *
     * @since 桑基图等复合图形
     **/
    private String linkItems;


    private String name;


    private String channel;


}