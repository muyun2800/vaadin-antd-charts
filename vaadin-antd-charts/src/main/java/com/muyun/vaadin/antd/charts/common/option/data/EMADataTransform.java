package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * EMADataTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class EMADataTransform extends DataTransform {


    String field;

    Number alpha;

    String as;

    public EMADataTransform() {
        super();
        this.type = "ema";
    }


}