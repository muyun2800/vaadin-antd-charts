package com.muyun.vaadin.antd.charts.demo.view.line;


import com.muyun.vaadin.antd.charts.common.option.ChartStyle;
import com.muyun.vaadin.antd.charts.common.option.Point;
import com.muyun.vaadin.antd.charts.common.option.interaction.Interaction;
import com.muyun.vaadin.antd.charts.common.option.interaction.InteractionTooltip;
import com.muyun.vaadin.antd.charts.line.Line;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import static com.muyun.vaadin.antd.charts.demo.view.line.LineUtils.getLineData;

/**
 * 基础用法
 *
 * @author muyun
 */
@Route("demo/line1")
@SuppressWarnings("java:S1199")
public class LineView1 extends Div {


    public LineView1() {


        Line line = new Line()
                .setData(getLineData())
                .setXField("year")
                .setYField("value")
                .setHeight(500)
                .setPoint(new Point()
                        .setShapeField("square")
                        .setSizeField(4)
                )
                .setInteraction(new Interaction()
                        .setTooltip(new InteractionTooltip()
                                .setMarker(false))
                )
                .setChartStyle(new ChartStyle()
                        .set("lineWidth", 2)
                );

        add(line);


    }


}
