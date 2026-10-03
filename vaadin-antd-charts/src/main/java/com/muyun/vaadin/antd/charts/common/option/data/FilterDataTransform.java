package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * FilterDataTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class FilterDataTransform extends DataTransform {

    /**
     * 回调函数签名： (v: any, idx: number, arr: any[]) => boolean;
     * The filter condition, same with [Array.prototype.filter](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/filter).
     */
    String callback;


    public FilterDataTransform() {
        super();
        this.type = "filter";
    }


}