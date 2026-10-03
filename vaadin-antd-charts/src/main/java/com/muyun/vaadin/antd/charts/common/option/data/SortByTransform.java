package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * SortByTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class SortByTransform extends DataTransform {


    /**
     * type: [field, order]; order: true => ascend, false => descend
     */
    Object fields;


    public SortByTransform() {
        super();
        this.type = "sortBy";
    }


}