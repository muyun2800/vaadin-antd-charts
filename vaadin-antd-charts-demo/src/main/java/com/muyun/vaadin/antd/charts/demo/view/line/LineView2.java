package com.muyun.vaadin.antd.charts.demo.view.line;


import com.muyun.vaadin.antd.charts.common.option.data.Data;
import com.muyun.vaadin.antd.charts.line.Line;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * 平滑曲线
 *
 * @author muyun
 */
@Route("demo/line2")
@SuppressWarnings("java:S1199")
public class LineView2 extends Div {


    public LineView2() {
        Line line = new Line()
                .setData(new Data()
                        .setType("fetch")
                        .setValue("https://gw.alipayobjects.com/os/bmw-prod/55424a73-7cb8-4f79-b60d-3ab627ac5698.json"))
                .setXField("year")
                .setYField("value")
                .setSizeField("value")
                .setColorField("category");

        super.add(line);
    }

}
