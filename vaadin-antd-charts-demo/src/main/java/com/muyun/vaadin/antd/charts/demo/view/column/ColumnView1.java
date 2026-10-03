package com.muyun.vaadin.antd.charts.demo.view.column;


import com.muyun.vaadin.antd.charts.column.Column;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import static com.muyun.vaadin.antd.charts.demo.view.column.ColumnUtils.getColumnData;

/**
 * @author muyun
 */
@Route("demo/column1")
@SuppressWarnings("java:S1199")
public class ColumnView1 extends Div {

    public ColumnView1() {
        Column column = new Column()
                .setData(getColumnData())
                .setXField("type")
                .setYField("value");
        //  .setSlider(Collections.singletonMap("x", new Slider()));
        //
        add(column);
    }


}
