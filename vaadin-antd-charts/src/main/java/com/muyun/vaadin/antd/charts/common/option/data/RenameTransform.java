package com.muyun.vaadin.antd.charts.common.option.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.Accessors;

/**
 * RenameTransform
 *
 * @author muyun
 **/
@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class RenameTransform extends DataTransform {


    //  [key: string]: string;

    public RenameTransform() {
        super();
        this.type = "rename";
    }
}