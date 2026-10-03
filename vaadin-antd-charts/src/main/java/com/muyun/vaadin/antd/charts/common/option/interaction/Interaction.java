package com.muyun.vaadin.antd.charts.common.option.interaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * todo 待完善，这是一个很大的对象
 * 参见：https://ant-design-charts.antgroup.com/options/plots/interaction/overview
 *
 * @author muyun
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
public class Interaction {


    public Interaction() {
    }


    private InteractionTooltip tooltip;


}