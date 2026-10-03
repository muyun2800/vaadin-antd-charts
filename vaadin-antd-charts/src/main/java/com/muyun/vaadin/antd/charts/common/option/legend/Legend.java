package com.muyun.vaadin.antd.charts.common.option.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Ant Design Charts 中 图例（Legend） 是图表的辅助元素，使用颜色、大小、形状区分不同的数据类型，用于图表中数据的筛选。
 * 可以理解为是非空间通道（ color，opacity，size，shape）对应比例尺的可视化，Ant Design Charts 会根据设置图形属性映射以及数据的类型自动生成不同的图例，
 * 当一个变量对应了多个图形属性时，Ant Design Charts 会对图例进行合并，以达到精简的目的。
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Legend {

    /**
     * 图例朝向，对于分类图例来说即滚动方向
     * horizontal | vertical
     */
    String orientation;

    /**
     * 图例的位置
     * top | right | left | bottom
     */
    String position;

    /**
     * 调整图例的 flex 布局方式
     */
    LegendLayout layout;

    /**
     * 图例容器的尺寸
     */
    Number size;

    /**
     * 图例容器的长度
     */
    Number length;

    /**
     * 图例的宽度
     */
    Number width;

    /**
     * 图例到图表区域的距离
     */
    Number crossPadding;

    /**
     * 图例在布局的时候的排序
     */
    Number order;


}