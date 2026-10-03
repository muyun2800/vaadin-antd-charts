package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * JoinTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class JoinTransform extends DataTransform {


    /**
     * The dataset to be joined.
     */
    Map<String, Object> join;

    /**
     * Join keys of 2 dataset, [k1, k2] means join on ds1.k1 === ds2.k2.
     * [string | ((d: any) => string), string | ((d: any) => string)]
     */
    String on;

    /**
     * Select fields from joined dataset.
     */
    String[] select;

    /**
     * Rename the select fields, default: keep the original name.
     */
    String[] as;

    /**
     * When not matched, use `unknown` instead.
     */
    Object unknown;


    public JoinTransform() {
        super();
        this.type = "join";
    }

}