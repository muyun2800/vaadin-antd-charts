package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * KDEDataTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class KDEDataTransform extends DataTransform {

    /**
     * Kernel Density Estimation field.
     */
    String field;


    /**
     * Group data by fields.
     */
    String[] groupBy;

    /**
     * Generate new fieds, default: ['y', 'size']
     */
    String[] as;

    /**
     * Defaults to smallest value in the array minus some threshold.
     */
    Number min;

    /**
     * Defaults to largest value in the array plus some threshold.
     */
    Number max;
    /**
     * Double of points to represent the pdf. Defaults to 10.
     */
    Number size;

    /**
     * Determine how many points to the left and right does an element affect,
     * similar to bandwidth in kernel density estimation. Defaults to 2.
     */
    Number width;


    public KDEDataTransform() {
        super();
        this.type = "kde";
    }
}