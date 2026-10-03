package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * MapTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class MapTransform extends DataTransform {

    /**
     * (d: any) => any
     */
    String callback;

    public MapTransform() {
        super();
        this.type = "map";
    }
}