package com.muyun.vaadin.antd.charts.common.option;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 参见：https://ant-design-charts.antgroup.com/options/plots/scale/overview
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Scale {

    String type;

    String palette;

    Number rangeMax;

    Number rangeMin;

    Number domainMax;

    Number domainMin;

    String key;

    Boolean facet;

    Boolean independent;

    Boolean zero;

    public Scale() {
    }

}