package com.muyun.vaadin.antd.charts.demo.view.pie;


import com.muyun.vaadin.antd.charts.common.option.label.Label;
import com.muyun.vaadin.antd.charts.common.option.label.LabelStyle;
import com.muyun.vaadin.antd.charts.pie.Pie;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import static com.muyun.vaadin.antd.charts.demo.view.column.ColumnUtils.getColumnData;

/**
 * @author muyun
 */
@Route("demo/pie2")
@SuppressWarnings("java:S1199")
public class PieView2 extends Div {

    public PieView2() {
        Pie pie = new Pie()
                .setData(getColumnData())
                .setAngleField("value")
                .setColorField("type")
                .setLabel(new Label()
                        .setText("value")
                        .setPosition("spider")
                        .setStyle(new LabelStyle().setFontWeight("bold")));
        //
        add(pie);

    }
}
