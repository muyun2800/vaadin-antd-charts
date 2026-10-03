package com.muyun.vaadin.antd.charts.common.option.interaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * InteractionTooltip
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class InteractionTooltip {

    Boolean marker;

}
