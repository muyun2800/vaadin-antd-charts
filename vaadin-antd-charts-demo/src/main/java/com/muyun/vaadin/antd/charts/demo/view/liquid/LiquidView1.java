package com.muyun.vaadin.antd.charts.demo.view.liquid;


import com.muyun.vaadin.antd.charts.liquid.Liquid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * @author muyun
 */
@Route("demo/liquid1")
@SuppressWarnings("java:S1199")
public class LiquidView1 extends Div {

    public LiquidView1() {
        Liquid liquid = new Liquid()
                .setPercent(0.3);
        //
        add(liquid);

    }
}
