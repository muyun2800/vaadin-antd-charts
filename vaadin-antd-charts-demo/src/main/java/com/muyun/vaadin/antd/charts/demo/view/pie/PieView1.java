package com.muyun.vaadin.antd.charts.demo.view.pie;


import com.muyun.vaadin.antd.charts.pie.Pie;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import static com.muyun.vaadin.antd.charts.demo.view.column.ColumnUtils.getColumnData;

/**
 * @author muyun
 */
@Route("demo/pie1")
@SuppressWarnings("java:S1199")
public class PieView1 extends Div {

    public PieView1() {
        Pie pie = new Pie()
                .setData(getColumnData())
                .setAngleField("value")
                .setColorField("type");
        //
        add(pie);
    }


}
