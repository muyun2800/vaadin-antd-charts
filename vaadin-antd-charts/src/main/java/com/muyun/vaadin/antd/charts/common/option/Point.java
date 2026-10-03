package com.muyun.vaadin.antd.charts.common.option;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Point
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Point {


    public Point() {
    }

    /**
     * 标记类型
     **/
    private String shapeField;

    /**
     * 标记大小
     **/
    private Number sizeField;


}