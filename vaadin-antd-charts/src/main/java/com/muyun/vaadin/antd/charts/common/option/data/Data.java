package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * Ant Design Charts 中的数据（Data） 主要用于指定需要可视化的数据和数据转换（预处理）。
 * 一个完整的数据声明由两部分构成：连接器（Connector） 和数据转换（DataTransform） 。
 * 其中连接器是获得数据的方式，通过 data.type 指定，数据转换是预处理函数，通过 data.transform 指定。
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Data {
    /**
     * 数据类型, fetch | inline
     **/
    String type;

    /**
     * 当type为fetch时，value为url。 当type为inline时，value为js数据对象
     */
    Object value;

    /**
     * 取值json |  csv
     * 仅当type为fetch时使用
     */
    String format;

    /**
     * 分隔符
     * 仅当type为fetch时使用
     */
    String delimiter;


    /**
     * Automatically infer the data to Javascript type
     */

    Boolean autoType;


    DataTransform[] transform;


}