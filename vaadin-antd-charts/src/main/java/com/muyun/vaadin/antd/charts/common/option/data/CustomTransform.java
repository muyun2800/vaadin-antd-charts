package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * CustomTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class CustomTransform extends DataTransform {


    /**
     * 回调函数签名： (d: any) => any;
     */
    String callback;

    public CustomTransform() {
        super();
        this.type = "custom";
    }


}