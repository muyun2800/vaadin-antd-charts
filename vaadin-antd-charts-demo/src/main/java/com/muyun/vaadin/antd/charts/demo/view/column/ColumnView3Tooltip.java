package com.muyun.vaadin.antd.charts.demo.view.column;


import com.muyun.vaadin.antd.charts.column.Column;
import com.muyun.vaadin.antd.charts.common.option.tooltip.Tooltip;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import static com.muyun.vaadin.antd.charts.demo.view.column.ColumnUtils.getColumnData;

/**
 * @author muyun
 */
@Route("demo/column3")
@SuppressWarnings("java:S1199")
public class ColumnView3Tooltip extends Div {

    public ColumnView3Tooltip() {
        Column column = new Column()
                .setData(getColumnData())
                .setXField("type")
                .setYField("value")
                .setTooltip(new Tooltip()
                        .setName("数量")
                        .setChannel("y"));

        //
        add(column);

    }
}
