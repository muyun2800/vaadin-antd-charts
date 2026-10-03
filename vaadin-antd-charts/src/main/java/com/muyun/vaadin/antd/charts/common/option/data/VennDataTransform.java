package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * VennDataTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class VennDataTransform extends DataTransform {

    /**
     * Canvas padding for 4 direction.
     * Default is `0`.
     */
    Number padding;

    /**
     * Set the sets field.
     * Default is `sets`.
     */
    String sets;

    /**
     * Set the size field for each set.
     * Default is `size`.
     */
    String size;


    /**
     * Set the generated fields, includes: [key, x, y, path]
     * [string, string]
     */
    String[] as;


    public VennDataTransform() {
        super();
        this.type = "venn";
    }


}