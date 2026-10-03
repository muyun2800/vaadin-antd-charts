package com.muyun.vaadin.antd.charts.demo.view.area;


import com.muyun.vaadin.antd.charts.area.Area;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import static com.muyun.vaadin.antd.charts.demo.view.area.AreaUtils.getAreaData;

/**
 * @author muyun
 */
@Route("demo/area1")
@SuppressWarnings("java:S1199")
public class AreaView1 extends Div {

    public AreaView1() {
        Area area = new Area()
                .setData(getAreaData())
                .setXField("date")
                .setYField("close");
        //
        add(area);
    }


}
