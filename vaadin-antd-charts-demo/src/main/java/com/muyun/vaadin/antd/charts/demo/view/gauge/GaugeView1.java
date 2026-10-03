package com.muyun.vaadin.antd.charts.demo.view.gauge;


import com.muyun.vaadin.antd.charts.gauge.Gauge;
import com.muyun.vaadin.antd.charts.gauge.GaugeData;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * @author muyun
 */
@Route("demo/gauge1")
@SuppressWarnings("java:S1199")
public class GaugeView1 extends Div {
    public GaugeView1() {
        Gauge gauge = new Gauge()
                .setAutoFit(true)
                .setData(new GaugeData()
                        .setTarget(120)
                        .setTotal(400)
                        .setName("score")
                );
        //


        add(gauge);
    }
}
