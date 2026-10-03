package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * SliceTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class SliceTransform extends DataTransform {


    /**
     * The start index for slice. Default is 0.
     */
    Number start;

    /**
     * The end index for slice. Default is arr.length - 1
     */
    Number end;


    public SliceTransform() {
        super();
        this.type = "slice";
    }
}