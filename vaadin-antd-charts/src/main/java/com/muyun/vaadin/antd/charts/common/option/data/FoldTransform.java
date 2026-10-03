package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * FoldTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class FoldTransform extends DataTransform {


    /**
     * Set fields will be folded.
     */
    String[] fields;


    /**
     * Fold key field, default is `key`.
     */
    String key;


    /**
     * Fold value field, default is `value`.
     */
    String value;


    public FoldTransform() {
        super();
        this.type = "fold";
    }
}