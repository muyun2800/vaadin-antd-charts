package com.muyun.vaadin.antd.charts.demo.view.line;


import com.muyun.vaadin.antd.charts.common.option.data.Data;
import com.muyun.vaadin.antd.charts.common.option.legend.Legend;
import com.muyun.vaadin.antd.charts.common.option.legend.LegendLayout;
import com.muyun.vaadin.antd.charts.line.Line;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.util.Collections;

/**
 * @author muyun
 */
@Route("demo/line3")
@SuppressWarnings("java:S1199")
public class LineView3Legend extends Div {


    public LineView3Legend() {
        Line line = new Line()
                .setData(new Data()
                        .setType("fetch")
                        .setValue("https://gw.alipayobjects.com/os/bmw-prod/55424a73-7cb8-4f79-b60d-3ab627ac5698.json"))
                .setXField("year")
                .setYField("value")
                .setSizeField("value")
                .setColorField("category");
        // 不显示图例
        // line .setLegend( false);
        //
        line.setLegend(Collections.singletonMap("color", new Legend()
                // 图例位于右侧
                .setPosition("right")
                .setLayout(new LegendLayout()
                        // 主轴（垂直）居中
                        .setJustifyContent("center"))
        ));


        super.add(line);
    }

}
